package cn.lacknb.service.impl;

import cn.lacknb.service.MailService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

/**
 * ClassName: MailServiceImpl <br/>
 * Description:  <br/>
 * date: 2020年03月15日 11:58 <br/>
 *
 * @author nianshao <br/>
 */
@Service
public class MailServiceImpl implements MailService {

    @Resource
    private JavaMailSender javaMailSender;

    @Value("${my.mail}")
    private String from;

    @Override
    public int sendSimpleMail(String toName, String title, String content) {
        SimpleMailMessage simple = new SimpleMailMessage();
        simple.setFrom(from);
        simple.setTo(toName);
        simple.setSubject(title);
        simple.setText(content);
        try {
            javaMailSender.send(simple);
            return 1;
        } catch (Exception e) {
            return 0;
        }

    }

    @Override
    public int sendHtmlMail(String toName, String subject, String content) throws MessagingException {

        MimeMessage message = javaMailSender.createMimeMessage();
        System.out.println("toName: " + toName);
        try {

            // true表示创建一个multipart message
            MimeMessageHelper helper = new MimeMessageHelper(message, true, "UTF-8");
            helper.setFrom(from);
            helper.setTo(toName);
            // 主题
            helper.setSubject(subject);
            // 邮件内容，true说明是html
            helper.setText(content, true);
            javaMailSender.send(message);
            return 1;
        } catch (Exception e){
            e.printStackTrace();
            return 0;
        }
    }
}
