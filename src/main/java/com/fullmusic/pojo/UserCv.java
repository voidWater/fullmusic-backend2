package com.fullmusic.pojo;

public class UserCv {
    private String id;

    private String vcUserId;

    private String vcStudentName;

    private Integer vcStudentAge;

    private String vcStudentPhone;

    private Integer vcLearingTime;

    private Integer vcHavePiano;

    private String vcAliasName;

    private String vcRemark;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getVcUserId() {
        return vcUserId;
    }

    public void setVcUserId(String vcUserId) {
        this.vcUserId = vcUserId == null ? null : vcUserId.trim();
    }

    public String getVcStudentName() {
        return vcStudentName;
    }

    public void setVcStudentName(String vcStudentName) {
        this.vcStudentName = vcStudentName == null ? null : vcStudentName.trim();
    }

    public Integer getVcStudentAge() {
        return vcStudentAge;
    }

    public void setVcStudentAge(Integer vcStudentAge) {
        this.vcStudentAge = vcStudentAge;
    }

    public String getVcStudentPhone() {
        return vcStudentPhone;
    }

    public void setVcStudentPhone(String vcStudentPhone) {
        this.vcStudentPhone = vcStudentPhone == null ? null : vcStudentPhone.trim();
    }

    public Integer getVcLearingTime() {
        return vcLearingTime;
    }

    public void setVcLearingTime(Integer vcLearingTime) {
        this.vcLearingTime = vcLearingTime;
    }

    public Integer getVcHavePiano() {
        return vcHavePiano;
    }

    public void setVcHavePiano(Integer vcHavePiano) {
        this.vcHavePiano = vcHavePiano;
    }

    public String getVcAliasName() {
        return vcAliasName;
    }

    public void setVcAliasName(String vcAliasName) {
        this.vcAliasName = vcAliasName == null ? null : vcAliasName.trim();
    }

    public String getVcRemark() {
        return vcRemark;
    }

    public void setVcRemark(String vcRemark) {
        this.vcRemark = vcRemark == null ? null : vcRemark.trim();
    }
}