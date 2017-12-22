package org.forten.enums;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public enum ChineseRegion {
    BeiJing("110", "北京市"),
    TianJin("120", "天津市"),
    HeBei("130", "河北省"),
    Shan1Xi("140", "山西省"),
    NeiMengGu("150", "内蒙古自治区"),
    LiaoNing("210", "辽宁省"),
    JiLin("220", "吉林省"),
    HeiLongJian("230", "黑龙江省"),
    ShangHai("310", "上海市"),
    JiangSu("320", "江苏省"),
    JeJiang("330", "浙江省"),
    AnHui("340", "安徽省"),
    FuJian("350", "福建省"),
    JiangXi("360", "江西省"),
    ShanDong("370", "山东省"),
    HeNan("410", "河南省"),
    HuBei("420", "湖北省"),
    HuNan("430", "湖南省"),
    GuangDong("440", "广东省"),
    HuangXi("450", "广西壮族自治区"),
    HaiNan("460", "海南省"),
    ChongQing("500", "重庆市"),
    SiChuan("510", "四川省"),
    GuiZhou("520", "贵州省"),
    YunNan("530", "云南省"),
    XiZang("540", "西藏自治区"),
    Shan3Xi("610", "陕西省"),
    GanSu("620", "甘肃省"),
    QingHai("630", "青海省"),
    NingXia("640", "宁夏回族自治区"),
    XinJiang("650", "新疆维吾尔自治区"),
    TaiWan("710", "台湾省"),
    XianGan("810", "香港特别行政区"),
    AoMen("820", "澳门特别行政区");

    private String code;
    private String name;

    ChineseRegion(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }
}
