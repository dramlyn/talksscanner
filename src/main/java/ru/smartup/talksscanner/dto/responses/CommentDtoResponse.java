package ru.smartup.talksscanner.dto.responses;

import java.util.Objects;

/**
 * Dto response for comments.
 */
public class CommentDtoResponse {

    private long id;
    private String authorFirstName;
    private String authorLastName;
    private String text;

    public CommentDtoResponse(long id, String authorFirstName, String authorLastName, String text) {
        this.id = id;
        this.authorFirstName = authorFirstName;
        this.authorLastName = authorLastName;
        this.text = text;
    }

    public CommentDtoResponse() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAuthorFirstName() {
        return authorFirstName;
    }

    public void setAuthorFirstName(String authorFirstName) {
        this.authorFirstName = authorFirstName;
    }

    public String getAuthorLastName() {
        return authorLastName;
    }

    public void setAuthorLastName(String authorLastName) {
        this.authorLastName = authorLastName;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CommentDtoResponse response = (CommentDtoResponse) o;
        return getId() == response.getId() && Objects.equals(getAuthorFirstName(), response.getAuthorFirstName()) && Objects.equals(getAuthorLastName(), response.getAuthorLastName()) && Objects.equals(getText(), response.getText());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getAuthorFirstName(), getAuthorLastName(), getText());
    }
}
