package com.example.githubrepositories.data.remote.response

import com.google.gson.annotations.SerializedName

data class PullRequestItemResponse(
    @SerializedName("url") val url: String,
    @SerializedName("id") val id: Int,
    @SerializedName("node_id") val nodeId: String,
    @SerializedName("html_url") val htmlUrl: String,
    @SerializedName("diff_url") val diffUrl: String,
    @SerializedName("patch_url") val patchUrl: String,
    @SerializedName("issue_url") val issueUrl: String,
    @SerializedName("number") val number: Int,
    @SerializedName("state") val state: String,
    @SerializedName("locked") val locked: Boolean,
    @SerializedName("title") val title: String,
    @SerializedName("user") val user: UserResponse,
    @SerializedName("body") val body: String?,
    @SerializedName("created_at") val createdAt: String,
    @SerializedName("updated_at") val updatedAt: String,
    @SerializedName("closed_at") val closedAt: Any,
    @SerializedName("merged_at") val mergedAt: Any,
    @SerializedName("merge_commit_sha") val mergeCommitSha: String,
    @SerializedName("assignee") val assignee: AssigneeResponse,
    @SerializedName("assignees") val assignees: List<AssigneeResponse>,
    @SerializedName("requested_reviewers") val requestedReviewers: List<RequestedReviewerResponse>,
    @SerializedName("requested_teams") val requestedTeams: List<Any>,
    @SerializedName("labels") val labels: List<LabelResponse>,
    @SerializedName("milestone") val milestone: Any,
    @SerializedName("draft") val draft: Boolean,
    @SerializedName("commits_url") val commitsUrl: String,
    @SerializedName("review_comments_url") val reviewCommentsUrl: String,
    @SerializedName("review_comment_url") val reviewCommentUrl: String,
    @SerializedName("comments_url") val commentsUrl: String,
    @SerializedName("statuses_url") val statusesUrl: String,
    @SerializedName("head") val head: HeadResponse,
    @SerializedName("base") val base: BaseResponse,
    @SerializedName("_links") val links: LinksResponse,
    @SerializedName("author_association") val authorAssociation: String,
    @SerializedName("auto_merge") val autoMerge: Any,
    @SerializedName("active_lock_reason") val activeLockReason: Any
)

data class AssigneeResponse(
    @SerializedName("login") val login: String,
    @SerializedName("id") val id: Int,
    @SerializedName("node_id") val nodeId: String,
    @SerializedName("avatar_url") val avatarUrl: String,
    @SerializedName("gravatar_id") val gravatarId: String,
    @SerializedName("url") val url: String,
    @SerializedName("html_url") val htmlUrl: String,
    @SerializedName("followers_url") val followersUrl: String,
    @SerializedName("following_url") val followingUrl: String,
    @SerializedName("gists_url") val gistsUrl: String,
    @SerializedName("starred_url") val starredUrl: String,
    @SerializedName("subscriptions_url") val subscriptionsUrl: String,
    @SerializedName("organizations_url") val organizationsUrl: String,
    @SerializedName("repos_url") val reposUrl: String,
    @SerializedName("events_url") val eventsUrl: String,
    @SerializedName("received_events_url") val receivedEventsUrl: String,
    @SerializedName("type") val type: String,
    @SerializedName("site_admin") val siteAdmin: Boolean
)

data class RequestedReviewerResponse(
    @SerializedName("login") val login: String,
    @SerializedName("id") val id: Int,
    @SerializedName("node_id") val nodeId: String,
    @SerializedName("avatar_url") val avatarUrl: String,
    @SerializedName("gravatar_id") val gravatarId: String,
    @SerializedName("url") val url: String,
    @SerializedName("html_url") val htmlUrl: String,
    @SerializedName("followers_url") val followersUrl: String,
    @SerializedName("following_url") val followingUrl: String,
    @SerializedName("gists_url") val gistsUrl: String,
    @SerializedName("starred_url") val starredUrl: String,
    @SerializedName("subscriptions_url") val subscriptionsUrl: String,
    @SerializedName("organizations_url") val organizationsUrl: String,
    @SerializedName("repos_url") val reposUrl: String,
    @SerializedName("events_url") val eventsUrl: String,
    @SerializedName("received_events_url") val receivedEventsUrl: String,
    @SerializedName("type") val type: String,
    @SerializedName("site_admin") val siteAdmin: Boolean
)

data class LabelResponse(
    @SerializedName("id") val id: Long,
    @SerializedName("node_id") val nodeId: String,
    @SerializedName("url") val url: String,
    @SerializedName("name") val name: String,
    @SerializedName("color") val color: String,
    @SerializedName("default") val default: Boolean,
    @SerializedName("description") val description: String
)

data class HeadResponse(
    @SerializedName("label") val label: String,
    @SerializedName("ref") val ref: String,
    @SerializedName("sha") val sha: String,
    @SerializedName("user") val user: UserResponse,
    @SerializedName("repo") val repo: RepoResponse
)

data class RepoResponse(
    @SerializedName("id") val id: Int,
    @SerializedName("node_id") val nodeId: String,
    @SerializedName("name") val name: String,
    @SerializedName("full_name") val fullName: String,
    @SerializedName("private") val `private`: Boolean,
    @SerializedName("owner") val owner: UserResponse,
    @SerializedName("html_url") val htmlUrl: String,
    @SerializedName("description") val description: String,
    @SerializedName("fork") val fork: Boolean,
    @SerializedName("url") val url: String,
    @SerializedName("forks_url") val forksUrl: String,
    @SerializedName("keys_url") val keysUrl: String,
    @SerializedName("collaborators_url") val collaboratorsUrl: String,
    @SerializedName("teams_url") val teamsUrl: String,
    @SerializedName("hooks_url") val hooksUrl: String,
    @SerializedName("issue_events_url") val issueEventsUrl: String,
    @SerializedName("events_url") val eventsUrl: String,
    @SerializedName("assignees_url") val assigneesUrl: String,
    @SerializedName("branches_url") val branchesUrl: String,
    @SerializedName("tags_url") val tagsUrl: String,
    @SerializedName("blobs_url") val blobsUrl: String,
    @SerializedName("git_tags_url") val gitTagsUrl: String,
    @SerializedName("git_refs_url") val gitRefsUrl: String,
    @SerializedName("trees_url") val treesUrl: String,
    @SerializedName("statuses_url") val statusesUrl: String,
    @SerializedName("languages_url") val languagesUrl: String,
    @SerializedName("stargazers_url") val stargazersUrl: String,
    @SerializedName("contributors_url") val contributorsUrl: String,
    @SerializedName("subscribers_url") val subscribersUrl: String,
    @SerializedName("subscription_url") val subscriptionUrl: String,
    @SerializedName("commits_url") val commitsUrl: String,
    @SerializedName("git_commits_url") val gitCommitsUrl: String,
    @SerializedName("comments_url") val commentsUrl: String,
    @SerializedName("issue_comment_url") val issueCommentUrl: String,
    @SerializedName("contents_url") val contentsUrl: String,
    @SerializedName("compare_url") val compareUrl: String,
    @SerializedName("merges_url") val mergesUrl: String,
    @SerializedName("archive_url") val archiveUrl: String,
    @SerializedName("downloads_url") val downloadsUrl: String,
    @SerializedName("issues_url") val issuesUrl: String,
    @SerializedName("pulls_url") val pullsUrl: String,
    @SerializedName("milestones_url") val milestonesUrl: String,
    @SerializedName("notifications_url") val notificationsUrl: String,
    @SerializedName("labels_url") val labelsUrl: String,
    @SerializedName("releases_url") val releasesUrl: String,
    @SerializedName("deployments_url") val deploymentsUrl: String,
    @SerializedName("created_at") val createdAt: String,
    @SerializedName("updated_at") val updatedAt: String,
    @SerializedName("pushed_at") val pushedAt: String,
    @SerializedName("git_url") val gitUrl: String,
    @SerializedName("ssh_url") val sshUrl: String,
    @SerializedName("clone_url") val cloneUrl: String,
    @SerializedName("svn_url") val svnUrl: String,
    @SerializedName("homepage") val homepage: String,
    @SerializedName("size") val size: Int,
    @SerializedName("stargazers_count") val stargazersCount: Int,
    @SerializedName("watchers_count") val watchersCount: Int,
    @SerializedName("language") val language: String,
    @SerializedName("has_issues") val hasIssues: Boolean,
    @SerializedName("has_projects") val hasProjects: Boolean,
    @SerializedName("has_downloads") val hasDownloads: Boolean,
    @SerializedName("has_wiki") val hasWiki: Boolean,
    @SerializedName("has_pages") val hasPages: Boolean,
    @SerializedName("has_discussions") val hasDiscussions: Boolean,
    @SerializedName("forks_count") val forksCount: Int,
    @SerializedName("mirror_url") val mirrorUrl: Any,
    @SerializedName("archived") val archived: Boolean,
    @SerializedName("disabled") val disabled: Boolean,
    @SerializedName("open_issues_count") val openIssuesCount: Int,
    @SerializedName("license") val license: LicenseResponse,
    @SerializedName("allow_forking") val allowForking: Boolean,
    @SerializedName("is_template") val isTemplate: Boolean,
    @SerializedName("web_commit_signoff_required") val webCommitSignoffRequired: Boolean,
    @SerializedName("topics") val topics: List<Any>,
    @SerializedName("visibility") val visibility: String,
    @SerializedName("forks") val forks: Int,
    @SerializedName("open_issues") val openIssues: Int,
    @SerializedName("watchers") val watchers: Int,
    @SerializedName("default_branch") val defaultBranch: String
)

data class BaseResponse(
    @SerializedName("label") val label: String,
    @SerializedName("ref") val ref: String,
    @SerializedName("sha") val sha: String,
    @SerializedName("user") val user: UserResponse,
    @SerializedName("repo") val repo: RepoResponse
)

data class LinksResponse(
    @SerializedName("self") val self: SelfResponse,
    @SerializedName("html") val html: HtmlResponse,
    @SerializedName("issue") val issue: IssueResponse,
    @SerializedName("comments") val comments: CommentsResponse,
    @SerializedName("review_comments") val reviewComments: ReviewCommentsResponse,
    @SerializedName("review_comment") val reviewComment: ReviewCommentResponse,
    @SerializedName("commits") val commits: CommitsResponse,
    @SerializedName("statuses") val statuses: StatusesResponse
)

data class SelfResponse(
    @SerializedName("href") val href: String
)

data class HtmlResponse(
    @SerializedName("href") val href: String
)

data class IssueResponse(
    @SerializedName("href") val href: String
)

data class CommentsResponse(
    @SerializedName("href") val href: String
)

data class ReviewCommentsResponse(
    @SerializedName("href") val href: String
)

data class ReviewCommentResponse(
    @SerializedName("href") val href: String
)

data class CommitsResponse(
    @SerializedName("href") val href: String
)

data class StatusesResponse(
    @SerializedName("href") val href: String
)
