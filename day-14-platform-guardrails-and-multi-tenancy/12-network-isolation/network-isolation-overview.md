# Network Isolation Overview

Network isolation controls:
- how workloads communicate within a Kubernetes platform.

By default,
Kubernetes networking allows:
- workload-to-workload communication.

Isolation introduces:
- communication boundaries.

---

# Why Network Isolation Matters

Not every workload should communicate with:
- every other workload.

Unrestricted communication increases:
- attack surface
- security risk
- and blast radius.

---

# Common Isolation Goals

Network isolation aims to provide:
- workload separation
- tenant protection
- and communication governance.

---

# Runtime Platform Protection

Isolation reduces:
- unauthorized communication
- lateral movement
- and cross-tenant impact.

---

# Platform Engineering Perspective

Communication should be explicitly allowed rather than implicitly trusted.

---

# Key Insight

Network access should be intentionally granted rather than universally available.
