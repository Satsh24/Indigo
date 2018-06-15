package model;

import lombok.Data;

/**
 * Model class for email object
 */
@Data
public class Email {

	/**
	 * The person who is receiving the Email
	 */
	private String recipiant;

	/**
	 * The subject to be displayed on mail
	 */
	private String mailSubject;

	/**
	 * The content to be sent in the mail
	 */
	private String mailContent;

	/**
	 * The sender of the email
	 */
	private String sender;

	/**
	 * No arg constructor
	 */
	public Email() {
	}

	/**
	 * constructor to instantiate the object
	 *
	 * @param reciever
	 * @param mailContent
	 */
	public Email(String reciever, String mailContent) {
		this.recipiant = reciever;
		this.mailContent = mailContent;
		this.sender = "sample.rfp2@gmail.com";
		this.mailSubject = "This is a generated mail from Spring";
	}

}
