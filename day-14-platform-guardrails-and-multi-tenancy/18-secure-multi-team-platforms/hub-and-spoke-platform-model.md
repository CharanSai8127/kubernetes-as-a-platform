# Hub And Spoke Platform Model

Large Kubernetes environments commonly adopt:
- hub and spoke architectures.

This model centralizes:
- platform capabilities

while isolating:
- application workloads.

---

# Hub Cluster Responsibilities

The hub commonly hosts:
- ArgoCD
- Vault
- observability platforms
- identity systems
- governance controls
- and shared platform services.

---

# Spoke Cluster Responsibilities

Spoke clusters commonly host:
- application workloads
- tenant services
- and business applications.

---

# Why Hub And Spoke Matters

Centralized operations improve:
- governance
- consistency
- and operational efficiency.

Spokes improve:
- isolation
- blast-radius reduction
- and workload separation.

---

# Platform Engineering Perspective

Shared services should remain centralized while workloads remain isolated.

---

# Key Insight

Hub and spoke architectures balance platform centralization with workload isolation.
