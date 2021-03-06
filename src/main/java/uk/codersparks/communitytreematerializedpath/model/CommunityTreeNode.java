package uk.codersparks.communitytreematerializedpath.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class CommunityTreeNode {

    private final String name;
    private final String path;
    private final List<CommunityTreeNode> children = new ArrayList<>();

    public CommunityTreeNode(String name, String path) {
        this.name = name;
        this.path = path;
    }

    public String getName() {
        return name;
    }

    public String getPath() { return path; }

    public List<CommunityTreeNode> getChildren() {
        return children;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CommunityTreeNode that = (CommunityTreeNode) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(children, that.children);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, children);
    }

    @Override
    public String toString() {
        return "CommunityTreeNode{" +
                "name='" + name + '\'' +
                ", children=" + children.stream().map(communityTreeNode -> communityTreeNode.getName()).collect(Collectors.toList()) +
                '}';
    }
}
