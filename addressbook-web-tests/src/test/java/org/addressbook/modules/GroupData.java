package org.addressbook.modules;

import java.util.Objects;

public class GroupData {
    private  int id;
    private final String name;
    private final String groupHeader;
    private final String groupFooter;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
    public GroupData( String name, String groupHeader, String groupFooter) {
        this.id = 0;
        this.name = name;
        this.groupHeader = groupHeader;
        this.groupFooter = groupFooter;
    }
    public GroupData(int id, String name, String groupHeader, String groupFooter) {
        this.id = id;
        this.name = name;
        this.groupHeader = groupHeader;
        this.groupFooter = groupFooter;
    }

    @Override
    public String toString() {
        return "GroupData{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GroupData groupData = (GroupData) o;
        return id == groupData.id &&
                Objects.equals(name, groupData.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
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
