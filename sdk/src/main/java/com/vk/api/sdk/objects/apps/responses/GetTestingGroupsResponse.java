// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.apps.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import java.util.List;
import java.util.Objects;

/**
 * GetTestingGroupsResponse object
 */
public class GetTestingGroupsResponse implements Validable {
    /**
     * Entity: groups
     */
    @SerializedName("group_id")
    @Required
    private Long groupId;

    @SerializedName("name")
    private String name;

    @SerializedName("platforms")
    private List<String> platforms;

    @SerializedName("user_ids")
    @Required
    private List<Long> userIds;

    @SerializedName("webview")
    private String webview;

    public Long getGroupId() {
        return groupId;
    }

    public GetTestingGroupsResponse setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }

    public String getName() {
        return name;
    }

    public GetTestingGroupsResponse setName(String name) {
        this.name = name;
        return this;
    }

    public List<String> getPlatforms() {
        return platforms;
    }

    public GetTestingGroupsResponse setPlatforms(List<String> platforms) {
        this.platforms = platforms;
        return this;
    }

    public List<Long> getUserIds() {
        return userIds;
    }

    public GetTestingGroupsResponse setUserIds(List<Long> userIds) {
        this.userIds = userIds;
        return this;
    }

    public String getWebview() {
        return webview;
    }

    public GetTestingGroupsResponse setWebview(String webview) {
        this.webview = webview;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(webview, groupId, userIds, name, platforms);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetTestingGroupsResponse getTestingGroupsResponse = (GetTestingGroupsResponse) o;
        return Objects.equals(webview, getTestingGroupsResponse.webview) &&
                Objects.equals(groupId, getTestingGroupsResponse.groupId) &&
                Objects.equals(userIds, getTestingGroupsResponse.userIds) &&
                Objects.equals(name, getTestingGroupsResponse.name) &&
                Objects.equals(platforms, getTestingGroupsResponse.platforms);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GetTestingGroupsResponse{");
        sb.append("webview='").append(webview).append("'");
        sb.append(", groupId=").append(groupId);
        sb.append(", userIds=").append(userIds);
        sb.append(", name='").append(name).append("'");
        sb.append(", platforms='").append(platforms).append("'");
        sb.append('}');
        return sb.toString();
    }
}