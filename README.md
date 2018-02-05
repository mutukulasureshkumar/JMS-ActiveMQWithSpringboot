# JMS-With-ActiveMQ
This is the project which shows the JMS working with the Spring Boot ActiveMQ Implemntation.

JMS - Is an Java API/Specifications foe thr the messing service.
There are multiple implemnetation sources like ActiveMQ, WebSphereMQ, RabbitMQ....

JMS generally use to ensure the messages pass to one sytem to another as asyn, Reliable.

Types of Messaging with JMS:
<ol>	
<li> Point to point messaging --> Here the participates are only two systems </li>
  <ul>
					<li>a) Sender</li>
					<li>b) Reciever.</li><br>
				<b>Sender sends the message to Queue<br>
        Reciever pulls the message from Queue.</b></li>
</ul><br><br>
<li> Publish Subscribe --> Here there are multiple systems would participate.</li><br>
			  <b>Sender publish the Topic (Message).<br>
        Multiple subscribers are allowed to read the topic.</b>
<br><br>
<li> JMS Headers --> There are various headers in JMS. The purpose of these header is to provide additional information about the messages.
 <ul>
	<li>1) JMSCorelationId: a Unique Id for the message, the sennder and reciever communicate the messages based on this Id.</li>
	<li>2) JMSDestination : destination of the reciever.</li>
	<li>3) JMS Expiration : Expiration time for message. Valid values are</li>
				<ul><li>    a) 0 : the message never expires until unless JMS discards the message.</li>
				<li>    b) Any Expiration time to expire the message</li></ul>
	<li>4) JMSDelivaryMode : There are two kinds of delivary modes.</li>
				<ul><li>    a) Persistant: Message should store in any file system or DB.</li>
				<li>    b) Non-Persistant : Messagrs are not stored and may lost while restart the system.</li></ul>
	<li>5) JMSMessageId: Unique ID set by provider.</li>
	<li>6) JMSPrioruty : 0-9 priority. 4 is the default priority. 5-9 --> High priority  0-4 --> Normal priority.</li>
	<li>7) JMSRedelivered : To overcome duplicate messages. 	</li>
	<li>8) JMSReplyTo : Address of reply Queue.</li>
	<li>9) JMSTimestamp : Timestamp of messages.</li>
	<li>10) JMSType: for custum message.</li>
   </ul></li></ol>
