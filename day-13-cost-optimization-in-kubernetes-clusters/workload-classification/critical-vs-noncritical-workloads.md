# Critical Vs NonCritical Workloads

Not all Kubernetes workloads require:
- identical infrastructure survivability guarantees.

Workloads should be classified based on:
- runtime criticality
- statefulness
- and interruption tolerance.

---

# Why Classification Matters

Critical workloads directly impact:
- platform survivability.

For these systems:

- downtime = platform instability.

---

# Critical Workloads

Critical workloads commonly include:
- kube-system components
- DNS
- CNI systems
- Gateway API controllers
- observability stacks
- Vault
- ArgoCD
- and stateful workloads.

These systems rely on:
- runtime continuity
- coordination
- and infrastructure stability.

---

# NonCritical Workloads

Non-critical workloads are commonly:
- stateless
- horizontally scalable
- and restart tolerant.

Examples include:
- frontend workloads
- batch jobs
- CI runners
- and interruption-tolerant APIs.

---

# Platform Engineering Perspective

Workload classification becomes:
- infrastructure survivability engineering.

---

# Key Insight

Infrastructure quality should align with workload survivability requirements.
