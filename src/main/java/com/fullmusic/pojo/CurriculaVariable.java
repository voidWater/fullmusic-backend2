package com.fullmusic.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class CurriculaVariable {
    private String id;

    private String vcTeacherId;

    private String vcStudentId;

    private String vcCourseId;

    private String vcCourseName;

    private String vcType;

    private Integer vcInvalid;

    private Integer vcPastdue;

    private Integer vcSuccess;

    private Integer vcOrder;

    private Integer vcDuration;
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date vcBegindate;
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date vcEnddate;

    private Date vcCreatedate;

    private Date vcUpdatedate;

    private String vcEvaluate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getVcTeacherId() {
        return vcTeacherId;
    }

    public void setVcTeacherId(String vcTeacherId) {
        this.vcTeacherId = vcTeacherId == null ? null : vcTeacherId.trim();
    }

    public String getVcStudentId() {
        return vcStudentId;
    }

    public void setVcStudentId(String vcStudentId) {
        this.vcStudentId = vcStudentId == null ? null : vcStudentId.trim();
    }

    public String getVcCourseId() {
        return vcCourseId;
    }

    public void setVcCourseId(String vcCourseId) {
        this.vcCourseId = vcCourseId == null ? null : vcCourseId.trim();
    }

    public String getVcCourseName() {
        return vcCourseName;
    }

    public void setVcCourseName(String vcCourseName) {
        this.vcCourseName = vcCourseName == null ? null : vcCourseName.trim();
    }

    public String getVcType() {
        return vcType;
    }

    public void setVcType(String vcType) {
        this.vcType = vcType == null ? null : vcType.trim();
    }

    public Integer getVcInvalid() {
        return vcInvalid;
    }

    public void setVcInvalid(Integer vcInvalid) {
        this.vcInvalid = vcInvalid;
    }

    public Integer getVcPastdue() {
        return vcPastdue;
    }

    public void setVcPastdue(Integer vcPastdue) {
        this.vcPastdue = vcPastdue;
    }

    public Integer getVcSuccess() {
        return vcSuccess;
    }

    public void setVcSuccess(Integer vcSuccess) {
        this.vcSuccess = vcSuccess;
    }

    public Integer getVcOrder() {
        return vcOrder;
    }

    public void setVcOrder(Integer vcOrder) {
        this.vcOrder = vcOrder;
    }

    public Integer getVcDuration() {
        return vcDuration;
    }

    public void setVcDuration(Integer vcDuration) {
        this.vcDuration = vcDuration;
    }

    public Date getVcBegindate() {
        return vcBegindate;
    }

    public void setVcBegindate(Date vcBegindate) {
        this.vcBegindate = vcBegindate;
    }

    public Date getVcEnddate() {
        return vcEnddate;
    }

    public void setVcEnddate(Date vcEnddate) {
        this.vcEnddate = vcEnddate;
    }

    public Date getVcCreatedate() {
        return vcCreatedate;
    }

    public void setVcCreatedate(Date vcCreatedate) {
        this.vcCreatedate = vcCreatedate;
    }

    public Date getVcUpdatedate() {
        return vcUpdatedate;
    }

    public void setVcUpdatedate(Date vcUpdatedate) {
        this.vcUpdatedate = vcUpdatedate;
    }

    public String getVcEvaluate() {
        return vcEvaluate;
    }

    public void setVcEvaluate(String vcEvaluate) {
        this.vcEvaluate = vcEvaluate == null ? null : vcEvaluate.trim();
    }
}