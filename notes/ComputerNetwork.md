**计算机网络**
电路交换：非共享，性能保障，效率低，需建立连接  
分组交换：有时延，效率高，易实现 时延：节点处理，传输，传播，排队  
层次：应用层（FTP,HTTP,SMTP）报文  
传输层 报文段 网络层 数据报 
链路层 帧 物理层 比特  
时分复用TDM 适合数字信号 频分复用FDM 适合模拟信号  
**应用层**  
客户端/服务器结构 P2P结构（无固定IP,自拓展性） 进程通信  
web应用 http协议：无状态，默认持久连接  
http请求报文与响应报文 请求报文：请求行（方法字段，url字段，协议版本），头部行  
响应报文：状态行（协议版本，状态码，状态信息），首部行，实体主体  
用户与服务器交互：请求与响应报文中包含用户cookie首部行  
FTP文件传输 控制连接21 数据连接  
邮件传输：用户代理，邮件服务器，邮件传输协议SMTP 推协议 邮件访问协议POP3，IMAP  
DNS服务 主机名解析IP地址 分布式，层次数据库：根DNS服务器，顶级域DNS服务器，权威DNS服务器  
DNS缓存 P2P应用 资源查询：集中式索引与洪泛查询，层次覆盖 套接字编程  

阻塞/同异步
阻塞/非阻塞在于是否立即得到结果，同异步在于是用户询问还是服务方通知
阻塞IO：用户线程发出IO请求后，处于阻塞状态，交出CPU。数据就绪后返回结果给用户线程，解除阻塞状态。
非阻塞IO（多路复用）：请求后立即得到错误的返回结果，用户线程阻塞，用一个线程不断轮询各个线程的状态，直到得到成功的结果。
异步IO：用户线程发出请求后立即返回，可以去做别的。数据准备好后内核服务线程通知用户线程使用。
