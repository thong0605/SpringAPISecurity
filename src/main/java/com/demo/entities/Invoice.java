package com.demo.entities;
// Generated Sep 18, 2020 7:52:41 AM by Hibernate Tools 5.2.12.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Invoice generated by hbm2java
 */
@Entity
@Table(name = "invoice", catalog = "demo_hibernate1")
public class Invoice implements java.io.Serializable {

	private Integer id;
	private Account account;
	private String name;
	private Date created;
	private String payment;
	private Set<InvoiceDetails> invoiceDetailses = new HashSet<InvoiceDetails>(0);

	public Invoice() {
	}

	public Invoice(Account account, String name, Date created, String payment) {
		this.account = account;
		this.name = name;
		this.created = created;
		this.payment = payment;
	}

	public Invoice(Account account, String name, Date created, String payment, Set<InvoiceDetails> invoiceDetailses) {
		this.account = account;
		this.name = name;
		this.created = created;
		this.payment = payment;
		this.invoiceDetailses = invoiceDetailses;
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

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "account_id", nullable = false)
	public Account getAccount() {
		return this.account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	@Column(name = "name", nullable = false, length = 250)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "created", nullable = false, length = 10)
	public Date getCreated() {
		return this.created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	@Column(name = "payment", nullable = false, length = 250)
	public String getPayment() {
		return this.payment;
	}

	public void setPayment(String payment) {
		this.payment = payment;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "invoice")
	public Set<InvoiceDetails> getInvoiceDetailses() {
		return this.invoiceDetailses;
	}

	public void setInvoiceDetailses(Set<InvoiceDetails> invoiceDetailses) {
		this.invoiceDetailses = invoiceDetailses;
	}

}
