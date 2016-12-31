package pkuhit.md;

import xap.sv.annotation.DictionaryTag;
import xap.model.BaseMasterModel;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;









public static final   String  CODE = "MDM11.AT01";
// 消息类型编码
public static final   String  TYPE_CODE = "MDM11.AT02";
// 名称
public static final   String  NAME = "MDM11.AT03";
// 描述
public static final   String  DESCRIPTION = "MDM11.AT04";
// 英文名称
public static final   String  ENGLISH_NAME = "MDM11.AT05";
// 英文简称
public static final   String  SHORT_ENGLISH_NAME = "MDM11.AT06";


@Column(name="MSG_CD") 
private  String code;

@Column(name="MSG_TP_CD") 
private  String typeCode;

@Column(name="NM") 
private  String name;

@Column(name="DES") 
private  String description;

@Column(name="NM_EN") 
private  String englishName;

@Column(name="SHT_NM_EN") 
private  String shortEnglishName;
// 消息类型名称
@DictionaryTag(code = "typeCode")
private  String typeName;

 {
     return this.code;
 }

 {
  this.code = code;
 }

 {
     return this.typeCode;
 }

 {
  this.typeCode = typeCode;
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
     return this.englishName;
 }

 {
  this.englishName = englishName;
 }

 {
     return this.shortEnglishName;
 }

 {
  this.shortEnglishName = shortEnglishName;
 }

 {
     return this.typeName;
 }

 {
  this.typeName = typeName;
 }

