package bases;
import java.io.Serializable;
import java.util.List;
import java.util.Map;




/**
 * Created by XSothing on 2017/7/3.
 */
public interface baseDao <T extends Serializable>  {



        /**
         * 通过ID查找对象
         *
         * @param id
         *            记录的ID
         * @param lock
         *            是否锁定对象
         * @return 实体对象
         */
        public T load(Serializable id, boolean lock);

        public T get(Serializable id);

        /**
         * 通过ID查找对象,不锁定对象
         *
         * @param id
         *            记录的ID
         * @return 实体对象
         */
        public T load(Serializable id);

        /**
         * 查找所有对象
         *
         * @return 对象列表
         */
        public List<T> findAll();





        /**
         * 通过示例对象查找对象列表
         *
         * @param eg
         *            示例对象
         * @param anyWhere
         *            是否模糊查询，默认false。
         * @param conds
         *            排序和is null的字段。分别为OrderBy和String。
         * @param exclude
         *            需要排除的属性
         * @return 对象列表
         */





        /**
         * 按属性查找对象列表.
         */
        public List<T> findByProperty(String property, Object value);
        /**
         * 按多组属性查找对象列表.
         */
        public List<T> findByProperties(Map<String, Object> properties);
        /**
         * 按属性查找唯一对象.
         */
        public T findUniqueByProperty(String property, Object value);

        /**
         * 按属性查找对象的数量
         *
         * @param property
         * @param value
         * @return
         */
        public int countByProperty(String property, Object value);
        public int countByProperties(Map<String ,Object> properties);
        public int countAll();



        public Object updateDefault(Object entity);

        /**
         * 保存对象
         *
         * @param entity
         *            实体对象
         * @return 实体对象
         */
        public T save(T entity);

        /**
         * 更新对象
         *
         * @param entity
         *            实体对象
         * @return 实体对象
         */
        public Object update(Object entity);

        /**
         * 保存或更新对象
         *
         * @param entity
         *            实体对象
         * @return 实体对象
         */
        public Object saveOrUpdate(Object entity);

        /**
         * 保存或更新对象拷贝
         *
         * @param entity
         * @return 已更新的持久化对象
         */
        public Object merge(Object entity);

        /**
         * 删除对象
         *
         * @param entity
         *            实体对象
         */
        public void delete(Object entity);

        /**
         * 根据ID删除记录
         *
         * @param id
         *            记录ID
         */
        public T deleteById(Serializable id);

        /**
         * 刷新对象
         *
         * @param entity
         */
        public void refresh(Object entity);

        /**
         * 获得实体Class
         *
         * @return
         */
        public Class<T> getPersistentClass();
        /**
         * 设置实体Class
         *
         * @return
         */
        public void setPersistentClass(Class<T> persistentClass);
        /**
         * 创建实体类的对象
         *
         * @return
         */
        public T createNewEntiey();

        public void virtualDelete(Serializable id);
        /**
         * 分页获取所有对象，使用默认分页大小20
         *
         * @return  返回分页内容，到达末端后返回null
         */

        /**
         * 分页获取所有对象，指定分页大小。
         *
         * @return  返回分页内容，到达末端后返回null
         */


    }


