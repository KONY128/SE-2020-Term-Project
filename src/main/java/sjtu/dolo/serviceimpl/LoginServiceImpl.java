package sjtu.dolo.serviceimpl;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sjtu.dolo.mapper.SectionMapper;
import sjtu.dolo.mapper.UserAuthMapper;
import sjtu.dolo.model.UserAuth;
import sjtu.dolo.service.LoginService;
import sjtu.dolo.utils.MybatisUtils;
import sjtu.dolo.utils.msgutils.Msg;

import javax.annotation.Resource;

@Service
public class LoginServiceImpl implements LoginService {
    @Resource
    private UserAuthMapper userAuthMapper;

    @Override
    public Msg login(String username, String password) {

        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserAuthMapper uMapper = sqlSession.getMapper(UserAuthMapper.class);
        UserAuth userAuth = uMapper.checkUser(username, password);
        sqlSession.commit();
        sqlSession.close();
//        UserAuth userAuth = userAuthMapper.checkUser(username, password);
        if(userAuth != null && (userAuth.getType().equals("0") || userAuth.getType().equals("1"))){
            return new Msg(0, userAuth.getType());
        } else {
            return new Msg(1, null);
        }
    }
}
