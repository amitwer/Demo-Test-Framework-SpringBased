package springbasedframework.rest;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


@SuppressWarnings("unused")//supressed since this is a demonstration framework. Also, auto-generated code.
public class PwndEntry {
    @JsonProperty("Description")
    private String description;
    @JsonProperty("IsSpamList")
    private Boolean isSpamList;
    @JsonProperty("IsActive")
    private Boolean isActive;
    @JsonProperty("IsSensitive")
    private Boolean isSensitive;
    @JsonProperty("IsRetired")
    private Boolean isRetired;
    @JsonProperty("Title")
    private String title;
    @JsonProperty("ModifiedDate")
    private String modifiedDate;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("IsFabricated")
    private Boolean isFabricated;
    @JsonProperty("AddedDate")
    private String addedDate;
    @JsonProperty("LogoType")
    private String logoType;
    @JsonProperty("PwnCount")
    private Integer pwnCount;
    @JsonProperty("BreachDate")
    private String breachDate;
    @JsonProperty("IsVerified")
    private Boolean isVerified;
    @JsonProperty("Domain")
    private String domain;
    @JsonProperty("DataClasses")
    private List<String> dataClasses;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getSpamList() {
        return isSpamList;
    }

    public void setSpamList(Boolean spamList) {
        isSpamList = spamList;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public Boolean getSensitive() {
        return isSensitive;
    }

    public void setSensitive(Boolean sensitive) {
        isSensitive = sensitive;
    }

    public Boolean getRetired() {
        return isRetired;
    }

    public void setRetired(Boolean retired) {
        isRetired = retired;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(String modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getFabricated() {
        return isFabricated;
    }

    public void setFabricated(Boolean fabricated) {
        isFabricated = fabricated;
    }

    public String getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(String addedDate) {
        this.addedDate = addedDate;
    }

    public String getLogoType() {
        return logoType;
    }

    public void setLogoType(String logoType) {
        this.logoType = logoType;
    }

    public Integer getPwnCount() {
        return pwnCount;
    }

    public void setPwnCount(Integer pwnCount) {
        this.pwnCount = pwnCount;
    }

    public String getBreachDate() {
        return breachDate;
    }

    public void setBreachDate(String breachDate) {
        this.breachDate = breachDate;
    }

    public Boolean getVerified() {
        return isVerified;
    }

    public void setVerified(Boolean verified) {
        isVerified = verified;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public List<String> getDataClasses() {
        return dataClasses;
    }

    public void setDataClasses(List<String> dataClasses) {
        this.dataClasses = dataClasses;
    }
}