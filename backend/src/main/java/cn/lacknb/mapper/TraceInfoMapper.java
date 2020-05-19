package cn.lacknb.mapper;

import cn.lacknb.pojo.TraceInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * ClassName: TraceInfoMapper <br/>
 * Description:  <br/>
 * date: 2020年05月02日 19:46 <br/>
 *
 * @author nianshao <br/>
 */
@Mapper
public interface TraceInfoMapper {

    int addTraceInfo(TraceInfo traceInfo);

    int deleteTraceInfo(TraceInfo traceInfo);

    List<TraceInfo> findAllTraceInfo();

    int addHistory(TraceInfo traceInfo);
}
