package pkuhit.xap.me;

import xap.sv.annotation.DictionaryTag;
import xap.model.BaseMasterModel;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;









public static final   String  CODE = "MEB01.AT01";
// 父领域编码
public static final   String  PARENT_CODE = "MEB01.AT02";
// 名称
public static final   String  NAME = "MEB01.AT03";
// 描述
public static final   String  DESCRIPTION = "MEB01.AT04";
// 英文简称
public static final   String  SHORT_ENGLISH_NAME_ = "MEB01.AT05";
// 英文名称
public static final   String  ENGLISH_NAME = "MEB01.AT06";


@Column(name="DO_CD") 
private  String code;

@Column(name="PAR_DO_CD") 
private  String parentCode;

@Column(name="NM") 
private  String name;

@Column(name="DES") 
private  String description;

@Column(name="SHT_NM_EN") 
private  String shortEnglishName;

@Column(name="NM_EN") 
private  String englishName;

 {
     return this.code;
 }

 {
  this.code = code;
 }

 {
     return this.parentCode;
 }

 {
  this.parentCode = parentCode;
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

