/**
 *	Mark Stephen Sobkow's Training Projects for Spring Tool Suite 4 features needed for MssCFe
 *
 *	WARNING: This is NOT a training guide to show you how to use Spring 4.
 *	Rather, it is my personal playground for learning how to work with
 *	various Spring 4 technologies I'll need for my own
 *	MSS Code Forge Environment project (MssCFe.)
 *
 *		Copyright 2020 Mark Stephen Sobkow
 *
 *		Licensed under the Apache License, Version 2.0 (the "License");
 *		you may not use this file except in compliance with the License.
 *		You may obtain a copy of the License at
 *
 *		    http://www.apache.org/licenses/LICENSE-2.0
 *
 *		Unless required by applicable law or agreed to in writing, software
 *		distributed under the License is distributed on an "AS IS" BASIS,
 *		WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *		See the License for the specific language governing permissions and
 *		limitations under the License.
 */
package org.msscf.sts4training.cfbmr;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Index;
import javax.persistence.NamedQuery;
import javax.persistence.NamedQueries;
import javax.persistence.Version;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

/**
 * @author msobkow
 */
@Entity
@Table(name = "mdlrepo", schema = "bmr31",
indexes = {@Index(name = "mdlrepo_pidx", columnList="id", unique = true ),
		@Index(name="mdlrepo_xuname", columnList="repo_name", unique = true )
})
@NamedQueries({
	@NamedQuery(name = "mdlrepo.findAll", query = "SELECT a FROM mdlrepo a"),
	@NamedQuery(name = "mdlrepo.findByName", query = "SELECT a FROM mdlrepo a WHERE a.repo_name = :repoName" )
})
public class CFBmrModelRepo implements Serializable {

	// Use the build number for all objects serialVersionUIDs
	static final long serialVersionUID = 11198L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id", nullable = false, updatable = false, insertable = true, unique = true )
	private Long id;
	
	@Version
	@Column(name = "versn", nullable = false, updatable = true, insertable = true)
	private OffsetDateTime version;

	@CreationTimestamp
	private LocalDateTime creationDateTime;
	
	@UpdateTimestamp
	private LocalDateTime updateDateTime;
	
	@Column(name = "repo_name", nullable = false, length = 64, updatable = false, insertable = true, unique = true)
	private String repoName;
	
	@Column(name = "repo_descr", nullable = false, length = 256, updatable = true, insertable = true)
	private String repoDescription;

	@Column(name = "repo_longdescr", nullable = true, length = 2000, updatable = true, insertable = true)
	private String repoLongDescription;
	
	protected CFBmrModelRepo() {}

	public CFBmrModelRepo( String name, String description, String longDescription ) {
		version = OffsetDateTime.now( ZoneId.of( "UTC" ) );
		repoName = name;
		repoDescription = description;
		repoLongDescription = longDescription;
	}
	
	@Override
	public String toString() {
		return String.format(
			"ModelRepo[id=%d, version={%s}, repoName='%s', repoDescription='%s', repoLongDescription='%s']",
			id, repoName, version.toString(), repoDescription, repoLongDescription );
	}

	public Long getId() {
		return id;
	}

	public OffsetDateTime getVersion() {
		return version;
	}

	public LocalDateTime getCreationDateTime() {
		return creationDateTime;
	}
	
	public LocalDateTime getUpdateDateTime() {
		return updateDateTime;
	}
	
	public String getRepoName() {
		return repoName;
	}
	
	public String getRepoDescription() {
		return repoDescription;
	}
	
	public void setRepoDescription( String description ) {
		repoDescription = description;
	}
	
	public String getRepoLongDescription() {
		return repoLongDescription;
	}
	
	public void setRepoLongDescription( String longDescription ) {
		repoLongDescription = longDescription;
	}
}
