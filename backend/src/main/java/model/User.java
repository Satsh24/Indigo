package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

/**
 * The model for the user to be stored in the database
 */
@Data
@Document(collection = "User")
@Entity
public class User {

	@Id
	@GeneratedValue
	private long id;

	/**
	 * First name of the User
	 */
	private String firstName;

	/**
	 * Last name of the User
	 */
	private String lastName;

	/**
	 * Email of the person
	 */
	private String email;

	/**
	 * To know active status and to soft delete the User record from the database.
	 */
	private boolean isActive;

	/**
	 * No argument constructor to instantiate the object
	 */
	public User() {
	}

	/**
	 * Constructor for creating the user object
	 *
	 * @param firstName
	 * @param lastName
	 * @param email
	 */
	public User(final String firstName, final String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return String.format("User[id=%s, title='%s']", id, firstName);
	}
}