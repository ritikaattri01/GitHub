package com.app.github.data.remote.dto

import com.google.gson.annotations.SerializedName

data class PullRequestDto(
    @SerializedName("active_lock_reason")
    val activeLockReason: Any? = null,
    @SerializedName("assignee")
    val assignee: Any? = null,
    @SerializedName("assignees")
    val assignees: List<Any?>? = null,
    @SerializedName("author_association")
    val authorAssociation: String? = null,
    @SerializedName("auto_merge")
    val autoMerge: Any? = null,
    @SerializedName("base")
    val base: Base? = null,
    @SerializedName("body")
    val body: String? = null,
    @SerializedName("closed_at")
    val closedAt: String? = null,
    @SerializedName("comments_url")
    val commentsUrl: String? = null,
    @SerializedName("commits_url")
    val commitsUrl: String? = null,
    @SerializedName("created_at")
    val createdAt: String? = null,
    @SerializedName("diff_url")
    val diffUrl: String? = null,
    @SerializedName("draft")
    val draft: Boolean? = null,
    @SerializedName("head")
    val head: Head? = null,
    @SerializedName("html_url")
    val htmlUrl: String? = null,
    @SerializedName("id")
    val id: Int? = null,
    @SerializedName("issue_url")
    val issueUrl: String? = null,
    @SerializedName("labels")
    val labels: List<Any?>? = null,
    @SerializedName("_links")
    val links: Links? = null,
    @SerializedName("locked")
    val locked: Boolean? = null,
    @SerializedName("merge_commit_sha")
    val mergeCommitSha: String? = null,
    @SerializedName("merged_at")
    val mergedAt: String? = null,
    @SerializedName("milestone")
    val milestone: Any? = null,
    @SerializedName("node_id")
    val nodeId: String? = null,
    @SerializedName("number")
    val number: Int? = null,
    @SerializedName("patch_url")
    val patchUrl: String? = null,
    @SerializedName("requested_reviewers")
    val requestedReviewers: List<Any?>? = null,
    @SerializedName("requested_teams")
    val requestedTeams: List<Any?>? = null,
    @SerializedName("review_comment_url")
    val reviewCommentUrl: String? = null,
    @SerializedName("review_comments_url")
    val reviewCommentsUrl: String? = null,
    @SerializedName("state")
    val state: String? = null,
    @SerializedName("statuses_url")
    val statusesUrl: String? = null,
    @SerializedName("title")
    val title: String? = null,
    @SerializedName("updated_at")
    val updatedAt: String? = null,
    @SerializedName("url")
    val url: String? = null,
    @SerializedName("user")
    val user: User? = null
) {
    data class Base(
        @SerializedName("label")
        val label: String? = null,
        @SerializedName("ref")
        val ref: String? = null,
        @SerializedName("repo")
        val repo: Repo? = null,
        @SerializedName("sha")
        val sha: String? = null,
        @SerializedName("user")
        val user: User? = null
    ) {
        data class Repo(
            @SerializedName("allow_forking")
            val allowForking: Boolean? = null,
            @SerializedName("archive_url")
            val archiveUrl: String? = null,
            @SerializedName("archived")
            val archived: Boolean? = null,
            @SerializedName("assignees_url")
            val assigneesUrl: String? = null,
            @SerializedName("blobs_url")
            val blobsUrl: String? = null,
            @SerializedName("branches_url")
            val branchesUrl: String? = null,
            @SerializedName("clone_url")
            val cloneUrl: String? = null,
            @SerializedName("collaborators_url")
            val collaboratorsUrl: String? = null,
            @SerializedName("comments_url")
            val commentsUrl: String? = null,
            @SerializedName("commits_url")
            val commitsUrl: String? = null,
            @SerializedName("compare_url")
            val compareUrl: String? = null,
            @SerializedName("contents_url")
            val contentsUrl: String? = null,
            @SerializedName("contributors_url")
            val contributorsUrl: String? = null,
            @SerializedName("created_at")
            val createdAt: String? = null,
            @SerializedName("default_branch")
            val defaultBranch: String? = null,
            @SerializedName("deployments_url")
            val deploymentsUrl: String? = null,
            @SerializedName("description")
            val description: String? = null,
            @SerializedName("disabled")
            val disabled: Boolean? = null,
            @SerializedName("downloads_url")
            val downloadsUrl: String? = null,
            @SerializedName("events_url")
            val eventsUrl: String? = null,
            @SerializedName("fork")
            val fork: Boolean? = null,
            @SerializedName("forks")
            val forks: Int? = null,
            @SerializedName("forks_count")
            val forksCount: Int? = null,
            @SerializedName("forks_url")
            val forksUrl: String? = null,
            @SerializedName("full_name")
            val fullName: String? = null,
            @SerializedName("git_commits_url")
            val gitCommitsUrl: String? = null,
            @SerializedName("git_refs_url")
            val gitRefsUrl: String? = null,
            @SerializedName("git_tags_url")
            val gitTagsUrl: String? = null,
            @SerializedName("git_url")
            val gitUrl: String? = null,
            @SerializedName("has_downloads")
            val hasDownloads: Boolean? = null,
            @SerializedName("has_issues")
            val hasIssues: Boolean? = null,
            @SerializedName("has_pages")
            val hasPages: Boolean? = null,
            @SerializedName("has_projects")
            val hasProjects: Boolean? = null,
            @SerializedName("has_wiki")
            val hasWiki: Boolean? = null,
            @SerializedName("homepage")
            val homepage: String? = null,
            @SerializedName("hooks_url")
            val hooksUrl: String? = null,
            @SerializedName("html_url")
            val htmlUrl: String? = null,
            @SerializedName("id")
            val id: Int? = null,
            @SerializedName("is_template")
            val isTemplate: Boolean? = null,
            @SerializedName("issue_comment_url")
            val issueCommentUrl: String? = null,
            @SerializedName("issue_events_url")
            val issueEventsUrl: String? = null,
            @SerializedName("issues_url")
            val issuesUrl: String? = null,
            @SerializedName("keys_url")
            val keysUrl: String? = null,
            @SerializedName("labels_url")
            val labelsUrl: String? = null,
            @SerializedName("language")
            val language: String? = null,
            @SerializedName("languages_url")
            val languagesUrl: String? = null,
            @SerializedName("license")
            val license: License? = null,
            @SerializedName("merges_url")
            val mergesUrl: String? = null,
            @SerializedName("milestones_url")
            val milestonesUrl: String? = null,
            @SerializedName("mirror_url")
            val mirrorUrl: Any? = null,
            @SerializedName("name")
            val name: String? = null,
            @SerializedName("node_id")
            val nodeId: String? = null,
            @SerializedName("notifications_url")
            val notificationsUrl: String? = null,
            @SerializedName("open_issues")
            val openIssues: Int? = null,
            @SerializedName("open_issues_count")
            val openIssuesCount: Int? = null,
            @SerializedName("owner")
            val owner: Owner? = null,
            @SerializedName("private")
            val `private`: Boolean? = null,
            @SerializedName("pulls_url")
            val pullsUrl: String? = null,
            @SerializedName("pushed_at")
            val pushedAt: String? = null,
            @SerializedName("releases_url")
            val releasesUrl: String? = null,
            @SerializedName("size")
            val size: Int? = null,
            @SerializedName("ssh_url")
            val sshUrl: String? = null,
            @SerializedName("stargazers_count")
            val stargazersCount: Int? = null,
            @SerializedName("stargazers_url")
            val stargazersUrl: String? = null,
            @SerializedName("statuses_url")
            val statusesUrl: String? = null,
            @SerializedName("subscribers_url")
            val subscribersUrl: String? = null,
            @SerializedName("subscription_url")
            val subscriptionUrl: String? = null,
            @SerializedName("svn_url")
            val svnUrl: String? = null,
            @SerializedName("tags_url")
            val tagsUrl: String? = null,
            @SerializedName("teams_url")
            val teamsUrl: String? = null,
            @SerializedName("topics")
            val topics: List<String?>? = null,
            @SerializedName("trees_url")
            val treesUrl: String? = null,
            @SerializedName("updated_at")
            val updatedAt: String? = null,
            @SerializedName("url")
            val url: String? = null,
            @SerializedName("visibility")
            val visibility: String? = null,
            @SerializedName("watchers")
            val watchers: Int? = null,
            @SerializedName("watchers_count")
            val watchersCount: Int? = null,
            @SerializedName("web_commit_signoff_required")
            val webCommitSignoffRequired: Boolean? = null
        ) {
            data class License(
                @SerializedName("key")
                val key: String? = null,
                @SerializedName("name")
                val name: String? = null,
                @SerializedName("node_id")
                val nodeId: String? = null,
                @SerializedName("spdx_id")
                val spdxId: String? = null,
                @SerializedName("url")
                val url: String? = null
            )

            data class Owner(
                @SerializedName("avatar_url")
                val avatarUrl: String? = null,
                @SerializedName("events_url")
                val eventsUrl: String? = null,
                @SerializedName("followers_url")
                val followersUrl: String? = null,
                @SerializedName("following_url")
                val followingUrl: String? = null,
                @SerializedName("gists_url")
                val gistsUrl: String? = null,
                @SerializedName("gravatar_id")
                val gravatarId: String? = null,
                @SerializedName("html_url")
                val htmlUrl: String? = null,
                @SerializedName("id")
                val id: Int? = null,
                @SerializedName("login")
                val login: String? = null,
                @SerializedName("node_id")
                val nodeId: String? = null,
                @SerializedName("organizations_url")
                val organizationsUrl: String? = null,
                @SerializedName("received_events_url")
                val receivedEventsUrl: String? = null,
                @SerializedName("repos_url")
                val reposUrl: String? = null,
                @SerializedName("site_admin")
                val siteAdmin: Boolean? = null,
                @SerializedName("starred_url")
                val starredUrl: String? = null,
                @SerializedName("subscriptions_url")
                val subscriptionsUrl: String? = null,
                @SerializedName("type")
                val type: String? = null,
                @SerializedName("url")
                val url: String? = null
            )
        }

        data class User(
            @SerializedName("avatar_url")
            val avatarUrl: String? = null,
            @SerializedName("events_url")
            val eventsUrl: String? = null,
            @SerializedName("followers_url")
            val followersUrl: String? = null,
            @SerializedName("following_url")
            val followingUrl: String? = null,
            @SerializedName("gists_url")
            val gistsUrl: String? = null,
            @SerializedName("gravatar_id")
            val gravatarId: String? = null,
            @SerializedName("html_url")
            val htmlUrl: String? = null,
            @SerializedName("id")
            val id: Int? = null,
            @SerializedName("login")
            val login: String? = null,
            @SerializedName("node_id")
            val nodeId: String? = null,
            @SerializedName("organizations_url")
            val organizationsUrl: String? = null,
            @SerializedName("received_events_url")
            val receivedEventsUrl: String? = null,
            @SerializedName("repos_url")
            val reposUrl: String? = null,
            @SerializedName("site_admin")
            val siteAdmin: Boolean? = null,
            @SerializedName("starred_url")
            val starredUrl: String? = null,
            @SerializedName("subscriptions_url")
            val subscriptionsUrl: String? = null,
            @SerializedName("type")
            val type: String? = null,
            @SerializedName("url")
            val url: String? = null
        )
    }

    data class Head(
        @SerializedName("label")
        val label: String? = null,
        @SerializedName("ref")
        val ref: String? = null,
        @SerializedName("repo")
        val repo: Repo? = null,
        @SerializedName("sha")
        val sha: String? = null,
        @SerializedName("user")
        val user: User? = null
    ) {
        data class Repo(
            @SerializedName("allow_forking")
            val allowForking: Boolean? = null,
            @SerializedName("archive_url")
            val archiveUrl: String? = null,
            @SerializedName("archived")
            val archived: Boolean? = null,
            @SerializedName("assignees_url")
            val assigneesUrl: String? = null,
            @SerializedName("blobs_url")
            val blobsUrl: String? = null,
            @SerializedName("branches_url")
            val branchesUrl: String? = null,
            @SerializedName("clone_url")
            val cloneUrl: String? = null,
            @SerializedName("collaborators_url")
            val collaboratorsUrl: String? = null,
            @SerializedName("comments_url")
            val commentsUrl: String? = null,
            @SerializedName("commits_url")
            val commitsUrl: String? = null,
            @SerializedName("compare_url")
            val compareUrl: String? = null,
            @SerializedName("contents_url")
            val contentsUrl: String? = null,
            @SerializedName("contributors_url")
            val contributorsUrl: String? = null,
            @SerializedName("created_at")
            val createdAt: String? = null,
            @SerializedName("default_branch")
            val defaultBranch: String? = null,
            @SerializedName("deployments_url")
            val deploymentsUrl: String? = null,
            @SerializedName("description")
            val description: String? = null,
            @SerializedName("disabled")
            val disabled: Boolean? = null,
            @SerializedName("downloads_url")
            val downloadsUrl: String? = null,
            @SerializedName("events_url")
            val eventsUrl: String? = null,
            @SerializedName("fork")
            val fork: Boolean? = null,
            @SerializedName("forks")
            val forks: Int? = null,
            @SerializedName("forks_count")
            val forksCount: Int? = null,
            @SerializedName("forks_url")
            val forksUrl: String? = null,
            @SerializedName("full_name")
            val fullName: String? = null,
            @SerializedName("git_commits_url")
            val gitCommitsUrl: String? = null,
            @SerializedName("git_refs_url")
            val gitRefsUrl: String? = null,
            @SerializedName("git_tags_url")
            val gitTagsUrl: String? = null,
            @SerializedName("git_url")
            val gitUrl: String? = null,
            @SerializedName("has_downloads")
            val hasDownloads: Boolean? = null,
            @SerializedName("has_issues")
            val hasIssues: Boolean? = null,
            @SerializedName("has_pages")
            val hasPages: Boolean? = null,
            @SerializedName("has_projects")
            val hasProjects: Boolean? = null,
            @SerializedName("has_wiki")
            val hasWiki: Boolean? = null,
            @SerializedName("homepage")
            val homepage: String? = null,
            @SerializedName("hooks_url")
            val hooksUrl: String? = null,
            @SerializedName("html_url")
            val htmlUrl: String? = null,
            @SerializedName("id")
            val id: Int? = null,
            @SerializedName("is_template")
            val isTemplate: Boolean? = null,
            @SerializedName("issue_comment_url")
            val issueCommentUrl: String? = null,
            @SerializedName("issue_events_url")
            val issueEventsUrl: String? = null,
            @SerializedName("issues_url")
            val issuesUrl: String? = null,
            @SerializedName("keys_url")
            val keysUrl: String? = null,
            @SerializedName("labels_url")
            val labelsUrl: String? = null,
            @SerializedName("language")
            val language: String? = null,
            @SerializedName("languages_url")
            val languagesUrl: String? = null,
            @SerializedName("license")
            val license: License? = null,
            @SerializedName("merges_url")
            val mergesUrl: String? = null,
            @SerializedName("milestones_url")
            val milestonesUrl: String? = null,
            @SerializedName("mirror_url")
            val mirrorUrl: Any? = null,
            @SerializedName("name")
            val name: String? = null,
            @SerializedName("node_id")
            val nodeId: String? = null,
            @SerializedName("notifications_url")
            val notificationsUrl: String? = null,
            @SerializedName("open_issues")
            val openIssues: Int? = null,
            @SerializedName("open_issues_count")
            val openIssuesCount: Int? = null,
            @SerializedName("owner")
            val owner: Owner? = null,
            @SerializedName("private")
            val `private`: Boolean? = null,
            @SerializedName("pulls_url")
            val pullsUrl: String? = null,
            @SerializedName("pushed_at")
            val pushedAt: String? = null,
            @SerializedName("releases_url")
            val releasesUrl: String? = null,
            @SerializedName("size")
            val size: Int? = null,
            @SerializedName("ssh_url")
            val sshUrl: String? = null,
            @SerializedName("stargazers_count")
            val stargazersCount: Int? = null,
            @SerializedName("stargazers_url")
            val stargazersUrl: String? = null,
            @SerializedName("statuses_url")
            val statusesUrl: String? = null,
            @SerializedName("subscribers_url")
            val subscribersUrl: String? = null,
            @SerializedName("subscription_url")
            val subscriptionUrl: String? = null,
            @SerializedName("svn_url")
            val svnUrl: String? = null,
            @SerializedName("tags_url")
            val tagsUrl: String? = null,
            @SerializedName("teams_url")
            val teamsUrl: String? = null,
            @SerializedName("topics")
            val topics: List<String?>? = null,
            @SerializedName("trees_url")
            val treesUrl: String? = null,
            @SerializedName("updated_at")
            val updatedAt: String? = null,
            @SerializedName("url")
            val url: String? = null,
            @SerializedName("visibility")
            val visibility: String? = null,
            @SerializedName("watchers")
            val watchers: Int? = null,
            @SerializedName("watchers_count")
            val watchersCount: Int? = null,
            @SerializedName("web_commit_signoff_required")
            val webCommitSignoffRequired: Boolean? = null
        ) {
            data class License(
                @SerializedName("key")
                val key: String? = null,
                @SerializedName("name")
                val name: String? = null,
                @SerializedName("node_id")
                val nodeId: String? = null,
                @SerializedName("spdx_id")
                val spdxId: String? = null,
                @SerializedName("url")
                val url: String? = null
            )

            data class Owner(
                @SerializedName("avatar_url")
                val avatarUrl: String? = null,
                @SerializedName("events_url")
                val eventsUrl: String? = null,
                @SerializedName("followers_url")
                val followersUrl: String? = null,
                @SerializedName("following_url")
                val followingUrl: String? = null,
                @SerializedName("gists_url")
                val gistsUrl: String? = null,
                @SerializedName("gravatar_id")
                val gravatarId: String? = null,
                @SerializedName("html_url")
                val htmlUrl: String? = null,
                @SerializedName("id")
                val id: Int? = null,
                @SerializedName("login")
                val login: String? = null,
                @SerializedName("node_id")
                val nodeId: String? = null,
                @SerializedName("organizations_url")
                val organizationsUrl: String? = null,
                @SerializedName("received_events_url")
                val receivedEventsUrl: String? = null,
                @SerializedName("repos_url")
                val reposUrl: String? = null,
                @SerializedName("site_admin")
                val siteAdmin: Boolean? = null,
                @SerializedName("starred_url")
                val starredUrl: String? = null,
                @SerializedName("subscriptions_url")
                val subscriptionsUrl: String? = null,
                @SerializedName("type")
                val type: String? = null,
                @SerializedName("url")
                val url: String? = null
            )
        }

        data class User(
            @SerializedName("avatar_url")
            val avatarUrl: String? = null,
            @SerializedName("events_url")
            val eventsUrl: String? = null,
            @SerializedName("followers_url")
            val followersUrl: String? = null,
            @SerializedName("following_url")
            val followingUrl: String? = null,
            @SerializedName("gists_url")
            val gistsUrl: String? = null,
            @SerializedName("gravatar_id")
            val gravatarId: String? = null,
            @SerializedName("html_url")
            val htmlUrl: String? = null,
            @SerializedName("id")
            val id: Int? = null,
            @SerializedName("login")
            val login: String? = null,
            @SerializedName("node_id")
            val nodeId: String? = null,
            @SerializedName("organizations_url")
            val organizationsUrl: String? = null,
            @SerializedName("received_events_url")
            val receivedEventsUrl: String? = null,
            @SerializedName("repos_url")
            val reposUrl: String? = null,
            @SerializedName("site_admin")
            val siteAdmin: Boolean? = null,
            @SerializedName("starred_url")
            val starredUrl: String? = null,
            @SerializedName("subscriptions_url")
            val subscriptionsUrl: String? = null,
            @SerializedName("type")
            val type: String? = null,
            @SerializedName("url")
            val url: String? = null
        )
    }

    data class Links(
        @SerializedName("comments")
        val comments: Comments? = null,
        @SerializedName("commits")
        val commits: Commits? = null,
        @SerializedName("html")
        val html: Html? = null,
        @SerializedName("issue")
        val issue: Issue? = null,
        @SerializedName("review_comment")
        val reviewComment: ReviewComment? = null,
        @SerializedName("review_comments")
        val reviewComments: ReviewComments? = null,
        @SerializedName("self")
        val self: Self? = null,
        @SerializedName("statuses")
        val statuses: Statuses? = null
    ) {
        data class Comments(
            @SerializedName("href")
            val href: String? = null
        )

        data class Commits(
            @SerializedName("href")
            val href: String? = null
        )

        data class Html(
            @SerializedName("href")
            val href: String? = null
        )

        data class Issue(
            @SerializedName("href")
            val href: String? = null
        )

        data class ReviewComment(
            @SerializedName("href")
            val href: String? = null
        )

        data class ReviewComments(
            @SerializedName("href")
            val href: String? = null
        )

        data class Self(
            @SerializedName("href")
            val href: String? = null
        )

        data class Statuses(
            @SerializedName("href")
            val href: String? = null
        )
    }

    data class User(
        @SerializedName("avatar_url")
        val avatarUrl: String? = null,
        @SerializedName("events_url")
        val eventsUrl: String? = null,
        @SerializedName("followers_url")
        val followersUrl: String? = null,
        @SerializedName("following_url")
        val followingUrl: String? = null,
        @SerializedName("gists_url")
        val gistsUrl: String? = null,
        @SerializedName("gravatar_id")
        val gravatarId: String? = null,
        @SerializedName("html_url")
        val htmlUrl: String? = null,
        @SerializedName("id")
        val id: Int? = null,
        @SerializedName("login")
        val login: String? = null,
        @SerializedName("node_id")
        val nodeId: String? = null,
        @SerializedName("organizations_url")
        val organizationsUrl: String? = null,
        @SerializedName("received_events_url")
        val receivedEventsUrl: String? = null,
        @SerializedName("repos_url")
        val reposUrl: String? = null,
        @SerializedName("site_admin")
        val siteAdmin: Boolean? = null,
        @SerializedName("starred_url")
        val starredUrl: String? = null,
        @SerializedName("subscriptions_url")
        val subscriptionsUrl: String? = null,
        @SerializedName("type")
        val type: String? = null,
        @SerializedName("url")
        val url: String? = null
    )
}
