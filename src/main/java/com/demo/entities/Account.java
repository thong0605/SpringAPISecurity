package com.demo.entities;
// Generated Sep 18, 2020 7:52:41 AM by Hibernate Tools 5.2.12.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;





/**
 * Account generated by hbm2java
 */
@Entity
@Table(name = "account", catalog = "demo_hibernate1")
public class Account implements java.io.Serializable {

	private Integer id;
	@NotEmpty
	@Length(min = 3, max = 18)
	private String username;
	@NotEmpty
	private String password;
	@NotEmpty
	private String fullName;
	private Set<Role> roles = new HashSet<Role>(0);
	private Set<Invoice> invoices = new HashSet<Invoice>(0);

	public Account() {
	}

	public Account(String username, String password, String fullName) {
		this.username = username;
		this.password = password;
		this.fullName = fullName;
	}

	public Account(String username, String password, String fullName, Set<Role> roles, Set<Invoice> invoices) {
		this.username = username;
		this.password = password;
		this.fullName = fullName;
		this.roles = roles;
		this.invoices = invoices;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "username", nullable = false, length = 250)
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name = "password", nullable = false, length = 250)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "fullName", nullable = false, length = 250)
	public String getFullName() {
		return this.fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "role_account", catalog = "demo_hibernate1", joinColumns = {
			@JoinColumn(name = "account_id", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "role_id", nullable = false, updatable = false) })
	public Set<Role> getRoles() {
		return this.roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "account")
	public Set<Invoice> getInvoices() {
		return this.invoices;
	}

	public void setInvoices(Set<Invoice> invoices) {
		this.invoices = invoices;
	}

}
