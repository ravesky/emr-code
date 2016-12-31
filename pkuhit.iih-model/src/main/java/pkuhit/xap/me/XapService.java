package pkuhit.xap.me;

import xap.sv.annotation.DictionaryTag;
import xap.model.BaseMasterModel;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;









public static final   String  CODE = "MEB05.AT01";
// 数据对象编码
public static final   String  OBJECT_CODE = "MEB05.AT02";
// 根服务编码
public static final   String  ROOT_CODE = "MEB05.AT03";
// 版本号
public static final   String  VERSION_NO = "MEB05.AT04";
// 名称
public static final   String  NAME = "MEB05.AT05";
// 描述
public static final   String  DESCRIPTION = "MEB05.AT06";
// 英文简称
public static final   String  SHORT_ENGLISH_NAME_ = "MEB05.AT07";
// 英文名称
public static final   String  ENGLISH_NAME = "MEB05.AT08";
// REST操作编码
public static final   String  REST_ACTION_CODE = "MEB05.AT09";
// REST资源
public static final   String  REST_RESOURCE = "MEB05.AT10";
// 访问审计标志
public static final   String  ACCESS_AUDIT_FLAG = "MEB05.AT11";
// 性能设计标志
public static final   String  PERFORMANCE_AUDIT_FLAG = "MEB05.AT12";


@Column(name="XSV_CD") 
private  String code;

@Column(name="OBJ_CD") 
private  String objectCode;

@Column(name="RT_XSV_CD") 
private  String rootCode;

@Column(name="VER_NO") 
private  String versionNo;

@Column(name="NM") 
private  String name;

@Column(name="DES") 
private  String description;

@Column(name="SHT_NM_EN") 
private  String shortEnglishName;

@Column(name="NM_EN") 
private  String englishName;

@Column(name="REST_ACT_CD") 
private  String restActionCode;

@Column(name="REST_RE") 
private  String restResource;

@Column(name="AC_AU_F") 
private  Integer accessAuditFlag;

@Column(name="PFM_AU_F") 
private  Integer performanceAuditFlag;
// 数据对象名称
private  String objectName;
// REST操作名称
@DictionaryTag(code = "restActionCode")
private  String restActionName;

 {
     return this.code;
 }

 {
  this.code = code;
 }

 {
     return this.objectCode;
 }

 {
  this.objectCode = objectCode;
 }

 {
     return this.rootCode;
 }

 {
  this.rootCode = rootCode;
 }

 {
     return this.versionNo;
 }

 {
  this.versionNo = versionNo;
 }

 {
     return this.name;
 }

 {
  this.name = name;
 }

 {
     return this.description;
 }

 {
  this.description = description;
 }

 {
     return this.shortEnglishName;
 }

 {
  this.shortEnglishName = shortEnglishName;
 }

 {
     return this.englishName;
 }

 {
  this.englishName = englishName;
 }

 {
     return this.restActionCode;
 }

 {
  this.restActionCode = restActionCode;
 }

 {
     return this.restResource;
 }

 {
  this.restResource = restResource;
 }

 {
     return this.accessAuditFlag;
 }

 {
  this.accessAuditFlag = accessAuditFlag;
 }

 {
     return this.performanceAuditFlag;
 }

 {
  this.performanceAuditFlag = performanceAuditFlag;
 }

 {
     return this.objectName;
 }

 {
  this.objectName = objectName;
 }

 {
     return this.restActionName;
 }

 {
  this.restActionName = restActionName;
 }

