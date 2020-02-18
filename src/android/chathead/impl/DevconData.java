package io.ionic.chathead.impl;

/**
 * Created by swayangjit on 17/2/20.
 */
public class DevconData {
    String identifier;
    String did = "";
    String profileId = "";
    String studentId = "";
    String stallId = "";
    String ideaId = "";
    String sid = "";

    public DevconData(String identifier) {
        this.identifier = identifier;
    }

    public String getIdentifier() {
        return identifier;
    }

    public String getDid() {
        return did;
    }

    public void setDid(String did) {
        if (did != null) {
            this.did = did;
        }
    }

    public String getProfileId() {
        return profileId;
    }

    public void setProfileId(String profileId) {
        if (profileId != null) {
            this.profileId = profileId;
        }
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        if (studentId != null) {
            this.studentId = studentId;
        }
    }

    public String getStallId() {
        return stallId;
    }

    public void setStallId(String stallId) {
        if (stallId != null) {
            this.stallId = stallId;
        }
    }

    public String getIdeaId() {
        return ideaId;
    }

    public void setIdeaId(String ideaId) {
        if (ideaId != null) {
            this.ideaId = ideaId;
        }
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        if (sid != null) {
            this.sid = sid;
        }
    }

    @Override
    public String toString() {
        return "DevconData{" +
                "identifier='" + identifier + '\'' +
                ", did='" + did + '\'' +
                ", profileId='" + profileId + '\'' +
                ", studentId='" + studentId + '\'' +
                ", stallId='" + stallId + '\'' +
                ", ideaId='" + ideaId + '\'' +
                ", sid='" + sid + '\'' +
                '}';
    }
}
