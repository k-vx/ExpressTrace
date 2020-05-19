package cn.lacknb.service;

import javax.mail.MessagingException;

/**
 * ClassName: MailService <br/>
 * Description:  <br/>
 * date: 2020年03月15日 11:56 <br/>
 *
 * @author nianshao <br/>
 */
public interface MailService {

    int sendSimpleMail(String toName, String title, String content);

    int sendHtmlMail(String toName, String subject, String content) throws MessagingException;

}
