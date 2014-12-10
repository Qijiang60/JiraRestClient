package de.micromata.jira.rest.core.domain;

import com.google.gson.annotations.Expose;


public class Errors {

    @Expose
    private String project;
    @Expose
    private String subtasks;
    @Expose
    private String attachment;
    @Expose
    private String issuelinks;

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public String getSubtasks() {
        return subtasks;
    }

    public void setSubtasks(String subtasks) {
        this.subtasks = subtasks;
    }

    public String getAttachment() {
        return attachment;
    }

    public void setAttachment(String attachment) {
        this.attachment = attachment;
    }

    public String getIssuelinks() {
        return issuelinks;
    }

    public void setIssuelinks(String issuelinks) {
        this.issuelinks = issuelinks;
    }
}