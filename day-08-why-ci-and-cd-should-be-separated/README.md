# Day 8 — Why CI And CD Should Be Separated

Continuous Integration and Continuous Delivery are frequently treated as:
- a single pipeline.

But in production systems:
- they solve different operational problems,
- operate at different trust boundaries,
- and require different security responsibilities.

This section focuses on:
- why CI and CD should remain operationally separated.

---

# Continuous Integration

The primary responsibility of CI is:
- validating artifacts.

CI pipelines commonly perform:
- testing
- build verification
- static analysis
- vulnerability scanning
- and artifact generation.

Examples include:
- SonarQube
- Trivy
- and OWASP Dependency Check.

The goal is:
- reducing deployment risk before artifacts move toward production.

---

# Security Inside CI

Security is integrated directly into:
- the validation layer.

CI systems commonly scan:
- source code
- dependencies
- filesystems
- and container images

for:
- vulnerabilities
- code smells
- and misconfigurations.

This establishes:
- trust in deployment artifacts.

---

# Continuous Delivery

CD focuses on:
- deployment orchestration
- rollout governance
- rollback handling
- and production reconciliation.

Even trusted artifacts may still create:
- unstable deployments
- startup storms
- dependency overload
- and cascading failures.

Deployment safety therefore requires:
- operational control.

---

# Why CI And CD Must Be Separated

CI and CD operate at:
- different operational layers
- with different trust boundaries.

CI systems frequently:
- execute user-controlled code
- process external dependencies
- and run validation workflows.

Granting production cluster access directly to CI creates:
- major operational and security risk.

---

# Least Privilege Access

One of the most important security principles is:
- least privilege access.

Every system should only receive:
- the minimum required permissions.

CI should validate artifacts.

CD should control production state.

This separation improves:
- security
- auditability
- rollback safety
- and deployment governance.

---

# GitOps And Argo CD

GitOps improves deployment control by making:
- Git repositories
the:
- declarative source of truth.

Instead of:

CI pipeline
→ direct cluster deployment

GitOps becomes:

CI validates artifacts
→ Git repository updated
→ Argo CD detects desired state
→ Kubernetes reconciles automatically

This improves:
- operational ownership
- rollback reliability
- deployment consistency
- and drift detection.

---

# Kubernetes Deployment Reality

Deployments are not only:
- code releases.

They are:
- operational infrastructure events.

Every deployment may impact:
- traffic
- dependencies
- startup behavior
- and platform stability.

This is why:
- deployment governance matters.

---

# Rollback And Recovery

Even validated deployments may fail:
- operationally.

Reliable systems therefore require:
- rollback capability
- deployment observability
- and controlled rollout behavior.

GitOps improves rollback reliability because:
- deployment history remains version-controlled in Git.

---

# Observability Matters

Pipeline success does not guarantee:
- runtime success.

Production systems require visibility into:
- rollout health
- restart behavior
- dependency stability
- latency
- and deployment impact.

Deployment safety depends heavily on:
- operational observability.

---

# Operational Risks

Direct production deployments from CI may create:
- uncontrolled rollouts
- configuration drift
- privilege escalation
- and large operational blast radius.

Modern systems reduce these risks using:
- GitOps
- RBAC
- progressive deployments
- and deployment reconciliation.

---

# Key Insight

CI establishes trust in artifacts.

CD establishes trust in deployments.

Both responsibilities should remain:
- operationally separated
to improve:
- security
- governance
- rollback safety
- and production reliability.
