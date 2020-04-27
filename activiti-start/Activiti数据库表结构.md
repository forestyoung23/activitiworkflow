## Activiti数据库表结构

**Activiti工作流总共包含25张表，所有的表名默认以"act_"开头**

- ACT_RE_*: 'RE'表示 repository。 这个前缀的表包含了流程定义和流程静态资源 （图片，
规则，等等）。
- ACT_RU_*: 'RU'表示 runtime。 这些运行时的表，包含流程实例，任务，变量，异步任务，
等运行中的数据。 Activiti只在流程实例执行过程中保存这些数据， 在流程结束时就会删
除这些记录。 这样运行时表可以一直很小速度很快。
- ACT_HI_*: 'HI'表示 history。 这些表包含历史数据，比如历史流程实例， 变量，任务等
等。
- AC T_GE_*: GE表示 general。通用数据， 用于不同场景下

[数据库表详解](<https://blog.csdn.net/hj7jay/article/details/51302829>)