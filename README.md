### 模版安装
1. Replate in Place (Cmd + Shift + R)
   1. Select "Directory"
   1. Replace All
   
1. Root => Refactor => Rename => Rename Directory
1. Root => Refactor => Rename => Rename Module
1. settings.gradle
   ```gradle
   include ':boilterplate'
   rootProject.name = "boilterplate"
   ```
1. Sync Project with Gradle Files

1. Rename Namespace Path
   1. Main Path => Refactor => Rename 
   1. "Rename Package"
   
1. Assets Rename module path
   1. Assets 下面子目录名字
   
1. 修改 .idea/workspace.xml 文件内容，
   1. 删除所有 <change/>
   ```
   <list default="true" id="da80696d-4d92-4a61-98f0-060c6169e2e9" name="Default Changelist" comment="" />
   ```

