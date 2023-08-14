package com.example.entities;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
@Entity
public class Genre_Master {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	long genereId;
	
	String genereDesc;
	
	public long getGenereId() {
		return genereId;
	}

	public void setGenereId(long genereId) {
		this.genereId = genereId;
	}

	public String getGenereDesc() {
		return genereDesc;
	}

	public void setGenereDesc(String genereDesc) {
		this.genereDesc = genereDesc;
	}

	public long getLanguageId() {
		return languageId;
	}

	public void setLanguageId(long languageId) {
		this.languageId = languageId;
	}

	@Override
	public String toString() {
		return "Genre_Master [genereId=" + genereId + ", genereDesc=" + genereDesc + ", languageId=" + languageId + "]";
	}

	@OneToOne
	long languageId;
}
