# Why CI Should Not Own Cluster Access

CI systems primarily validate:
- code
- builds
- and deployment artifacts.

They should not directly own:
- production cluster mutation permissions.

---

# Why This Matters

CI pipelines frequently:
- execute user-controlled code
- process pull requests
- and interact with external dependencies.

Granting production access to CI increases:
- operational risk significantly.

---

# Security Risk

Compromised CI systems may:
- deploy malicious workloads
- mutate infrastructure
- expose secrets
- or destabilize production environments.

---

# Operational Separation

CD systems should independently control:
- rollout orchestration
- deployment reconciliation
- and production mutation.

This improves:
- security boundaries.

---

# GitOps Advantage

GitOps removes the requirement for:
- direct cluster access inside CI pipelines.

This reduces:
- privilege exposure
- and deployment blast radius.

---

# Key Insight

Artifact validation systems should remain isolated from production infrastructure mutation systems.
