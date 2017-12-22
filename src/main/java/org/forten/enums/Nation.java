package org.forten.enums;

/**
 * 中国的56个少数民族
 */
public enum Nation {
    Han("汉"),
    Man("满"),
    Zhuang("壮"),
    Hui("回"),
    Miao("苗"),
    WeiWuEr("维吾尔"),
    TuJia("土家"),
    Yi("彝"),
    MengGu("蒙古"),
    Zang("藏"),
    BuYi("布依"),
    Dong("侗"),
    Yao("瑶"),
    ChaoXian("朝鲜"),
    Bai("白"),
    HaNi("哈尼"),
    HaSaKe("哈萨克"),
    Li("黎"),
    Dai("傣"),
    She("畲"),
    SuSu("僳僳"),
    GeLao("仡佬"),
    DongXiang("东乡"),
    LaKu("拉祜"),
    Shui("水"),
    Wa("佤"),
    NaXi("纳西"),
    Qiang("羌"),
    Tu("土"),
    MuLao("仫佬"),
    XiBo("锡伯"),
    KeErKeZi("柯尔克孜"),
    DaWoEr("达斡尔"),
    JingPo("景颇"),
    MaoNan("毛南"),
    SaLa("撒拉"),
    BuLang("布朗"),
    TaJiKe("塔吉克"),
    AChang("阿昌"),
    PuMi("普米"),
    EWenKe("鄂温克"),
    Nu("怒"),
    Jing("京"),
    JiNuo("基诺"),
    DeAng("德昂"),
    BaoAn("保安"),
    ELuoSi("俄罗斯"),
    YuGu("裕固"),
    WuZiBieKe("乌孜别克"),
    MenBa("门巴"),
    ELunChun("鄂伦春"),
    DuLong("独龙"),
    TaTaEr("塔塔尔"),
    HeZhe("赫哲"),
    GaoShan("高山"),
    LuoBa("珞巴");

    private String name;

    Nation(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
