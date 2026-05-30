# Pod Security Admission

Pod Security Admission is a native Kubernetes security mechanism.

It enforces:
- workload security requirements
before workloads enter the cluster.

---

# Why Pod Security Admission Matters

Not all workloads should be allowed to:
- run as root
- use privileged mode
- access host resources
- or bypass security controls.

---

# Security Profiles

Kubernetes commonly provides:

Privileged

Baseline

Restricted

profiles.

---

# Runtime Platform Protection

Pod Security Admission reduces:
- insecure workload deployment
- privilege escalation
- and attack surface exposure.

---

# Platform Engineering Perspective

Security validation should occur before workloads are admitted.

---

# Key Insight

Workloads should meet security requirements before they are allowed to run.
