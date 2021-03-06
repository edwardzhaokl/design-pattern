### 行为型模式 - Behavior Pattern

学习难度：★★★☆☆  
使用频率：★★★★☆

行为型模式是对在不同的对象之间划分责任和算法的抽象化.  
行为型模式:  
1. 关注类和对象的结构;  
2. 重点关注它们之间的相互作用.  

类行为型模式:  
使用继承关系在几个类之间分配行为,  
通过多态等方式来分配父类与子类的职责.  

对象行为型模式:  
使用对象的聚合&关联关系来分配行为,  
通过对象关联等方式来分配两个或多个类的职责.  

根据"合成复用原则", 要尽量使用关联关系取代继承关系.  




名称|-|重要性| 学习难度 | 使用频率
:---:|:---:|:---:|:---:|:---:|
职责链 | Chain of Responsibility | 3 | 3 | 2 
命令   | Command                 | 4 | 3 | 4 
解释器 | Interpreter             | 1 | 4 | 1 
迭代器 | Iterator                | 5 | 3 | 5 
中介者 | Mediator                | 2 | 3 | 2 
备忘录 | Memento                 | 2 | 2 | 2 
观察者 | Observer                | 5 | 3 | 5 
状态   | State                   | 3 | 3 | 3 
策略   | Strategy                | 4 | 1 | 4 
模板方法 | Template Method       | 3 | 2 | 3 
访问者   | Visitor               | 1 | 4 | 1 