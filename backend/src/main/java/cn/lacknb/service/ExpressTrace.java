package cn.lacknb.service;

import java.io.IOException;

/**
 * ClassName: ExpressTrace <br/>
 * Description:  <br/>
 * date: 2020年05月02日 17:56 <br/>
 *
 * @author nianshao <br/>
 */
public interface ExpressTrace {

    public String getExpressName(String number) throws IOException;

}
