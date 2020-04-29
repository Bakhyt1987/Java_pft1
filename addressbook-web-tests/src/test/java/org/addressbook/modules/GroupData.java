package org.addressbook.modules;

public class GroupData {
    private final String name;
    private final String groupHeader;
    private final String groupFooter;

    public GroupData(String name, String groupHeader, String groupFooter) {
        this.name = name;
        this.groupHeader = groupHeader;
        this.groupFooter = groupFooter;
    }

    public String getName() {
        return name;
    }

    public String getGroupHeader() {
        return groupHeader;
    }

    public String getGroupFooter() {
        return groupFooter;
    }
}
