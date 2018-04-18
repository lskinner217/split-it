package project.cs495.splitit;

import project.cs495.splitit.models.User;

public class GroupMemeber {
    private User member;
    private String groupId;

    public GroupMemeber(User member, String groupId) {
        this.member = member;
        this.groupId = groupId;
    }

    public User getMember() {
        return member;
    }

    public String getGroupId() {
        return groupId;
    }
}