package service;

import dao.UserDao;
import dao.UserDaoImpl;
import model.User;

public class UserServiceImpl implements UserService {
	UserDao userDao = new UserDaoImpl();
	
	@Override
    public User login(String username, String password) {
        User user = userDao.get(username);
        if (user != null && password.equals(user.getPassWord())) {
            return user;
        }
        return null;
    }

    @Override
    public User get(String username) {
        return userDao.get(username);
    }

//    @Override
//    public void insert(User user) {
//        userDao.insert(user);
//    }
//
//    @Override
//    public boolean checkExistUsername(String username) {
//        return userDao.checkExistUsername(username);
//    }
}
