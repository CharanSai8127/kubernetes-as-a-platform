# Direct CI To Cluster Deployment

A common beginner deployment model is:

Git push
→ CI pipeline executes
→ CI deploys directly to production cluster

This tightly couples:
- validation systems
with:
- production mutation systems.

---

# Why This Is Dangerous

CI pipelines frequently:
- execute user-controlled code
- process dependencies
- and interact with external systems.

If compromised,
the pipeline may directly:
- mutate infrastructure
- expose secrets
- or deploy malicious workloads.

---

# Operational Risks

Direct deployments may create:
- uncontrolled rollouts
- failed production deployments
- and large operational blast radius.

---

# Safer Alternative

Modern systems commonly use:
- GitOps-based deployment reconciliation.

CI validates artifacts.
CD controls deployment state safely.

---

# Key Insight

Artifact validation systems should not directly own unrestricted production mutation access.
