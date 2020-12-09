package com.pidev.snowtamproject.Model;


public class Snowtam {
    private String id;
    private String entity;
    private String status;
    private String Qcode;
    private String Area;
    private String SubArea;
    private String Condition;
    private String Subject;
    private String Modifier;
    private String message;
    private String startdate;
    private String enddate;
    private String all;
    private String location;
    private boolean isICAO;
    private String Created;
    private String key;
    private String type;
    private String StateCode;
    private String StateName;
    private int criticality;

    public Snowtam() {
    }

    public Snowtam(String id, String entity, String status, String Qcode, String Area, String SubArea, String Condition, String Subject, String Modifier, String message, String startdate, String enddate, String all, String location, Boolean isICAO, String Created, String key, String type, String StateCode, String StateName, int criticality) {
        this.id=id;
        this.entity=entity;
        this.Qcode=Qcode;
        this. Area=Area;
        this.SubArea=SubArea;
        this.Condition=Condition;
        this.Subject=Subject;
        this.Modifier=Modifier;
        this.message=message;
        this.startdate=startdate;
        this.enddate=enddate;
        this.all=all;
        this.location=location;
        this.isICAO=isICAO;
        this.Created=Created;
        this.key=key;
        this.type=type;
        this.StateCode=StateCode;
        this.StateName=StateName;
        this.criticality=criticality;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEntity() {
        return entity;
    }

    public void setEntity(String entity) {
        this.entity = entity;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getQcode() {
        return Qcode;
    }

    public void setQcode(String Qcode) {
        this.Qcode = Qcode;
    }

    public String getArea() {
        return Area;
    }

    public void setArea(String Area) {
        this.Area = Area;
    }

    public String getSubArea() {
        return SubArea;
    }

    public void setSubArea(String SubArea) {
        this.SubArea = SubArea;
    }

    public String getCondition() {
        return Condition;
    }

    public void setCondition(String Condition) {
        this.Condition = Condition;
    }

    public String getSubject() {
        return Subject;
    }

    public void setSubject(String Subject) {
        this.Subject = Subject;
    }

    public String getModifier() {
        return Modifier;
    }

    public void setModifier(String Modifier) {
        this.Modifier = Modifier;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStartdate() {
        return startdate;
    }

    public void setStartdate(String startdate) {
        this.startdate = startdate;
    }

    public String getEnddate() {
        return enddate;
    }

    public void setEnddate(String enddate) {
        this.enddate = enddate;
    }

    public String getAll() {
        return all;
    }

    public void setAll(String all) {
        this.all = all;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public boolean getIsICAO() {
        return isICAO;
    }

    public void setIsICAO(boolean isICAO) {
        this.isICAO = isICAO;
    }

    public String getCreated() {
        return Created;
    }

    public void setCreated(String Created) {
        this.Created = Created;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStateCode() {
        return StateCode;
    }

    public void setStateCode(String StateCode) {
        this.StateCode = StateCode;
    }

    public String getStateName() {
        return StateName;
    }

    public void setStateName(String StateName) {
        this.StateName = StateName;
    }

    public int getCriticality() {
        return criticality;
    }

    public void setCriticality(int criticality) {
        this.criticality = criticality;
    }
}