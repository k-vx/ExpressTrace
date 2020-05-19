package cn.lacknb.service.impl;

import cn.lacknb.mapper.TraceInfoMapper;
import cn.lacknb.pojo.TraceInfo;
import cn.lacknb.service.TraceInfoService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * ClassName: TraceInfoImpl <br/>
 * Description:  <br/>
 * date: 2020年05月02日 19:51 <br/>
 *
 * @author nianshao <br/>
 */
@Service
public class TraceInfoImpl implements TraceInfoService {


    @Resource
    private TraceInfoMapper traceInfoMapper;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int addTraceInfo(TraceInfo traceInfo) {
        traceInfoMapper.addHistory(traceInfo);
        return traceInfoMapper.addTraceInfo(traceInfo);
    }

//    @Override
//    @Transactional(rollbackFor = Exception.class)
//    public int addHistory(TraceInfo traceInfo) {
//        return traceInfoMapper.addHistory(traceInfo);
//    }

    @Override
    public int deleteTranceInfo(TraceInfo traceInfo) {
        return traceInfoMapper.deleteTraceInfo(traceInfo);
    }

    @Override
    public List<TraceInfo> findAllTraceInfo() {
        return traceInfoMapper.findAllTraceInfo();
    }
}
