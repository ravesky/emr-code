Ext.define('iih.sy.search.action.AdvancedSearchAction', {
	extend: 'Xap.ej.action.ServiceInvocation',
	requires: ['Xap.ej.block.Layer'],
	doExecute: function(context) {
		 
		this.showLoading();
	    this.callParent();
	    var pageNum ,pageSize; 
	    var owner = this.getOwner();
		var block = owner.getBlock('condition');
		this.turnpage = false;
	    if(context.event && context.event.name == "turnpage"){
	    	this.turnpage = true;
    		pageNum = context.event.arguments[0];
    		pageSize = context.event.arguments[1];
		}else {
			pageNum = context.pageNum; 
			pageSize = context.pageSize; 
		}
	    console.log(context);
	   // var condition = block.getData();
	    
    	//condition.pageNum=pageNum;
    	//condition.pageSize=pageSize;
    	//this.getOwner().pageSize=pageSize;
    	 
	    
	    var data = block.getItemData(block);
		
	    for(var key in data){
	    	if(data[key] == null || data[key] == undefined){
	    		delete data[key];
	    	}
	    	
	    	if(data[key] instanceof Date){
	    		var date = data[key];
	    		data[key] = Ext.Date.format(date,'Y-m-d H:i:s');
	    		//data.key = date.format("Y-m-d H:i:s");
	    	}
	    }
	    
	    if(pageNum == null){
	    	pageNum = 1;
	    }
	    if(pageSize == null){
	    	pageSize = 20;
	    }
	    data.pageNum = pageNum;
	    data.pageSize = pageSize;
	    
	    console.log(context);
	   
        var operations = context.operations;      
        this.prepareOperations(operations,data);  
	},  
	 prepareOperations: function(operations,data) { 
        var url = this.url;   
        url += '?';
        for(var key in data){
        	url += '&'+ key + '=' + data[key];
        }
        var METHODS = this.getInvocationMethods();
        
      /*  var mclass = null;
        if(block.getModelClass) {
            mclass = block.getModelClass();
        }*/
        
        var operation = {
            url: url,
            mclass: null,
            method: METHODS.METHOD_GET,
            condition: null,
            data:data,
            scope: this,
            success: this.onSuccess,
            fail: this.onFail
        };
        operations.push(operation);	    
	 },
	 
	 onFail: function(operation) { 
		 alert("查询失败");
	 },  
     onSuccess: function(operation) {
         var data;
    	 var pageSize=this.getOwner().pageSize;
    	 var block = this.getBlock('result');
         // TODO 数据格式就这样了？
         if(operation.result){
 	        resultData=operation.result;
 	        if(this.turnpage){
 	        	resultData.pageSize =undefined;
 	        }
 	        console.log(resultData);
     	 	block.setData(resultData);
         }else{
        	block.setData(null);
         }
     }    
});