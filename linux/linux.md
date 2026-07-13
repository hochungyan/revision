## 1. A filesystem shows 100% full in df -h, but du -sh /* only accounts for 60% of the space. What's going on and how do you fix it?

A process is holding open a deleted file - the space isn't released until the file descriptor closes. find it with lsof +L1 or lsof | grep deleted, identify the process (often a log fille that was rm'd instead of truncated), then either restart the process or truncate via proc filesystem: > /proc/<PID>/fd/<FD>. Prevention: use truncate -s 0 file or logrotate with copytruncate instead of delteing live logs.

## 2. A production host is unresponsive and users cannot connect to the application. How would you troubleshoot it?

First, I would clarify whether the entire host is unreachable or only one application is unavailable. I would verify DNS, then test network reachability with ping, remembering that ICMP may be blocked. Next, I would test the required TCP port with nc -vz or telnet. I would use traceroute or ip route get to investigate routing. If I could access the host through SSH or a console, I would use ss -tlnp to confirm that the service is listening, then check CPU, memory, disk, systemd status and logs.

## 3. The application is down, but the server responds to ping. What would you check next?
nc -vz hostname 8080
curl -v http://hostname:8080/health

ss -tlnp | grep 8080
systemctl status application
journalctl -u application


## 4. Check current dir
pwd


## 5. Memory check
free -h 

## 6. Check current process
either htop/top or ps -ef | grep PID


## 7, Difference between memory and disk
Memory
It usually means RAM
It is:
1.) Fast
2.) Temp
3.) Used by other processes
4.) Cleared when the machine restarts

Check it with:
free -h 

Disk
Persistent storage, such as an SSD/hard-drive
It is:
1.) Slower than RAM
2.) Persistent after restart
3.) Used for files/application/databases/logs

Check it with:
df -h

Check directory usage with:
du -sh /path


Swap
Swap is disk spaced used as an extension of memory when RAM is under pressure.
Check it with:
swaponon --show
free -h   

Swap is much slower than physical RAM


