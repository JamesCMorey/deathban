## Hardcore Server Plugin
Permabans players who die. They can be unbanned via the /pardon command, but otherwise they stay banned.

### Installation
Either grab one of the .jar releases from https://github.com/JamesCMorey/deathban/releases or build from 
source as detailed below

#### Dependencies
```bash
sudo apt install gradle
```

#### Building
```bash
git clone https://github.com/JamesCMorey/deathban.git
cd deathban
gradle clean build
```

.jar file can be found at at **deathban/build/libs/DeathBan-X.X.jar**

#### Install
Place the .jar file in the plugins folder and restart the minecraft instance.

### Warning
This script will ban operators on death as well. Be careful to avoid losing access to your server.
