package fun.liwudi.hystrixservice.service;

/**
 * @author 李武第
 */
public interface HelloService {
    String helloService(String name);

    String hiError(String name);
}
