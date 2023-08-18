package dto

data class PostWithComments(
    val post: PostWithAuthor,
    val comments: List<CommentWithAuthor>,
)