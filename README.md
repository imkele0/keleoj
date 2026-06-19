# KeleOJ - 在线评测系统

> 完整项目，包含：OPS 后端 + 代码沙箱

## 项目结构

```
keleoj/
├── keleoj-backend/        ← 判题系统后端（Spring Boot + MySQL + MyBatis-Plus）
└── kele-code-sandbox/     ← 代码沙箱（Spring Boot + Docker 容器隔离执行）
```

## 子项目说明

### keleoj-backend — 判题系统后端
- **端口**：8121
- **技术栈**：Spring Boot 2.7 + MyBatis-Plus + MySQL + Knife4j
- **功能**：用户管理、题目管理、代码提交、异步判题、COS 文件上传
- **API 文档**：https://imkele0.github.io/keleoj-api-doc/

### kele-code-sandbox — 代码沙箱
- **端口**：8090
- **技术栈**：Spring Boot 2.7 + Docker Java + SecurityManager
- **功能**：Docker 容器隔离执行 Java 代码，内存/CPU/网络限制，超时控制
- **设计模式**：模板方法模式（编译→执行→清理流程标准化）

## 架构

```
用户前端 → keleoj-backend (:8121) → 异步判题 → kele-code-sandbox (:8090) → Docker 容器执行
```

## 快速开始

```bash
# 1. 启动沙箱
cd kele-code-sandbox
mvn spring-boot:run

# 2. 启动后端
cd keleoj-backend
mvn spring-boot:run

# 3. 访问 API 文档
# http://localhost:8121/api/doc.html
```
