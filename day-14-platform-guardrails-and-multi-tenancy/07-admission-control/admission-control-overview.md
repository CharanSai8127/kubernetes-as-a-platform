# Admission Control Overview

Admission control is the final validation stage before:
- resources are stored in Kubernetes.

It acts as:
- the platform enforcement point.

---

# Why Admission Control Matters

Authentication verifies:
- identity.

Authorization verifies:
- permissions.

Admission control verifies:
- platform compliance.

---

# Runtime Request Flow

A request commonly follows:

Authentication
↓

Authorization
↓

Admission Control
↓

etcd

---

# Platform Protection

Admission control prevents:
- insecure workloads
- invalid configurations
- and governance violations.

---

# Platform Engineering Perspective

Admission control becomes:
- the platform gatekeeper.

---

# Key Insight

Not everything that is authorized should be admitted.
