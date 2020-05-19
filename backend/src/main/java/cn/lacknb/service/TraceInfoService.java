package cn.lacknb.service;

import cn.lacknb.pojo.TraceInfo;

import java.util.List;

/**
 * ClassName: TraceInfoService <br/>
 * Description:  <br/>
 * date: 2020年05月02日 19:51 <br/>
 *
 * @author nianshao <br/>
 */
public interface TraceInfoService {

    int addTraceInfo(TraceInfo traceInfo);

//    int addHistory(TraceInfo traceInfo);

    int deleteTranceInfo(TraceInfo traceInfo);

    List<TraceInfo> findAllTraceInfo();

}
