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