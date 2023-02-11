package models;

import java.io.Serializable;

public class ProjectBookmark implements Serializable {
    private final User addingUser;
    private final User creatorUser;
    private final Bookmark bookmark;

    public ProjectBookmark(User participatingUser, User userBookmark, Bookmark bookmark) {
        this.addingUser = participatingUser;
        this.creatorUser = userBookmark;
        this.bookmark = bookmark;
    }

    public String getBookmarkName(){ return this.bookmark.getName();}

    public String getBookmarkDate(){ return this.bookmark.getData();}

    public User getAddingUser() {
        return addingUser;
    }

    public User getCreator() {
        return creatorUser;
    }

    public Bookmark getBookmark() {
        return bookmark;
    }
}
