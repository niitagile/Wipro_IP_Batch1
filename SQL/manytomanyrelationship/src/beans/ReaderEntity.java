package beans;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import javax.persistence.SequenceGenerator;
@Entity
public class ReaderEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="readerid_seq")
	@SequenceGenerator(name="readerid_seq", sequenceName ="readerid_seq" )
	
	private int readerId;
		@Column(length=20)	
		private String readerName;
		
		
		@ManyToMany(cascade=CascadeType.ALL)
		@JoinTable(name="reader_subscriptions", joinColumns= {@JoinColumn(name="readerId")}, inverseJoinColumns= {@JoinColumn(name="SubsId")})
		private Set<SubscriptionEntity>subscriptions;
		public int getReaderId() {
			return readerId;
		}
		public void setReaderId(int readerId) {
			this.readerId = readerId;
		}
		public String getReaderName() {
			return readerName;
		}
		public void setReaderName(String readerName) {
			this.readerName = readerName;
		}
		public Set<SubscriptionEntity> getSubscriptions() {
			return subscriptions;
		}
		public void setSubscriptions(Set<SubscriptionEntity> subscriptions) {
			this.subscriptions = subscriptions;
		}
}
